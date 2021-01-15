/**
 * 
 */
package co.com.sale.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.sale.data.BookData;
import co.com.sale.data.SaleData;
import co.com.sale.data.UserLibraryData;
import co.com.sale.model.Book;
import co.com.sale.model.Sale;
import co.com.sale.model.UserLibrary;
import co.com.sale.repository.SaleRepository;
import co.com.sale.utiliy.Utility;


/**
 * Servicio que almancena la venta
 * @author Administrador
 *
 */
@Service
@Transactional
public class SaleService {
	@Autowired
	SaleRepository reposi;

	public void add(SaleData saleData) {
		reposi.save(entityToDataSale(saleData));
	}

	/**
	 * Metodo que convierte un SaleData en Sale
	 * 
	 * @param saleData
	 * @return
	 */
	private Sale entityToDataSale(SaleData saleData) {
		Sale sale = new Sale();
		sale.setSaleDate(Utility.ParseFecha(saleData.getSaleDate()));
		sale.setTotal(saleData.getTotal());
		sale.setIdUser(entityToDataUser(saleData.getUser()));
		sale.setBookCollection(saleData.getBooks().stream().map(this::entityToData).collect(Collectors.toList()));
		return sale;
	}

	/**
	 * Metodo que conviete un BookData en Book
	 * 
	 * @param book
	 * @return
	 */
	private Book entityToData(BookData book) {
		return new Book(book.getIdBook(), book.getNameBook(), book.getPrice(), book.getQuantity());
	}

	/**
	 * Metodo encargado de convertir un userData en userLibrary
	 * 
	 * @param user
	 * @return
	 */
	private UserLibrary entityToDataUser(UserLibraryData user) {
		return new UserLibrary(user.getIdUser(), user.getNameUser(), user.getUserPassword(), user.getEamil(),
				user.getUserLogin());
	}

}
