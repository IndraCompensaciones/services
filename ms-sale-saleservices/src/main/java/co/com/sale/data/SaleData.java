/**
 * 
 */
package co.com.sale.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * @author Administrador
 *
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SaleData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal total;

	private String saleDate;

	private Collection<BookData> books;

	private UserLibraryData user;

	public SaleData(BigDecimal total, String saleDate, Collection<BookData> books, UserLibraryData user) {
		super();
		this.total = total;
		this.saleDate = saleDate;
		this.books = books;
		this.user = user;
	}

	public SaleData() {

	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public Collection<BookData> getBooks() {
		return books;
	}

	public void setBooks(Collection<BookData> books) {
		this.books = books;
	}

	public UserLibraryData getUser() {
		return user;
	}

	public void setIdUser(UserLibraryData user) {
		this.user = user;
	}

}
