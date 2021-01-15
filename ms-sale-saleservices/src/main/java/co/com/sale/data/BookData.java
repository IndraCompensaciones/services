package co.com.sale.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class BookData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idBook;
	
	private String nameBook;

	private String imagen;

	private BigDecimal price;

	private long quantity;

	public BookData() {

	}

	public BookData(Long idBook, String nameBook, String imagen, BigDecimal price, long quantity) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.imagen = imagen;
		this.price = price;
		this.quantity = quantity;
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

	public Long getIdBook() {
		return idBook;
	}

	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}

	
}
