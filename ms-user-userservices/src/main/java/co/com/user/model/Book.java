package co.com.user.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_BOOK", nullable = false)
    private Long idBook;
    @Basic(optional = false)
    @Column(name = "NAME_BOOK", nullable = false, length = 100)
    private String nameBook;
    @Column(name = "IMAGEN", length = 100)
    private String imagen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRICE", nullable = false, precision = 10, scale = 4)
    private BigDecimal price;
    @Basic(optional = false)
    @Column(name = "QUANTITY", nullable = false)
    private long quantity;

    @ManyToMany(mappedBy = "bookCollection")
    private Collection<Sale> saleCollection;

    public Book() {
    }

    public Book(Long idBook) {
        this.idBook = idBook;
    }

    public Book(Long idBook, String nameBook, BigDecimal price, long quantity) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @XmlTransient
    public Collection<Sale> getSaleCollection() {
        return saleCollection;
    }

    public void setSaleCollection(Collection<Sale> saleCollection) {
        this.saleCollection = saleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBook != null ? idBook.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.idBook == null && other.idBook != null) || (this.idBook != null && !this.idBook.equals(other.idBook))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.library.user.service.Book[ idBook=" + idBook + " ]";
    }
    
}
