/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "SALE")
public class Sale implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "ID_SALE", nullable = false)
	@SequenceGenerator(name = "SALE_SEQ", sequenceName = "SALE_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SALE_SEQ")
	private Long idSale;
	@Basic(optional = false)
	@Column(name = "TOTAL", nullable = false, precision = 10, scale = 4)
	private BigDecimal total;
	@Basic(optional = false)
	@Column(name = "SALE_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date saleDate;

	@JoinTable(name = "SALE_HAS_BOOK", joinColumns = {
			@JoinColumn(name = "ID_SALE", referencedColumnName = "ID_SALE", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ID_BOOK", referencedColumnName = "ID_BOOK", nullable = false) })
	@ManyToMany
	private Collection<Book> bookCollection;

	@JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER", nullable = false)
	@ManyToOne(optional = false)
	private UserLibrary idUser;

	public Sale() {
	}

	public Sale(Long idSale) {
		this.idSale = idSale;
	}

	public Sale(Long idSale, BigDecimal total, Date saleDate) {
		this.idSale = idSale;
		this.total = total;
		this.saleDate = saleDate;
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	@XmlTransient
	public Collection<Book> getBookCollection() {
		return bookCollection;
	}

	public void setBookCollection(Collection<Book> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public UserLibrary getIdUser() {
		return idUser;
	}

	public void setIdUser(UserLibrary idUser) {
		this.idUser = idUser;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idSale != null ? idSale.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Sale)) {
			return false;
		}
		Sale other = (Sale) object;
		if ((this.idSale == null && other.idSale != null)
				|| (this.idSale != null && !this.idSale.equals(other.idSale))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "co.com.library.user.service.Sale[ idSale=" + idSale + " ]";
	}

}
