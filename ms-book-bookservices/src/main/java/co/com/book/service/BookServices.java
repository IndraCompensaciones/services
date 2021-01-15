package co.com.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.book.data.BookData;
import co.com.book.model.Book;
import co.com.book.repository.BookRepository;

/**
 * Servicio que consulta los libros
 * @author Administrador
 *
 */
@Service
@Transactional
public class BookServices {
	@Autowired
	BookRepository reposi;

	/**
	 * 
	 * @return
	 */
	public List<BookData> getListBook() {
		return reposi.findAll().stream().map(this::entityToData).collect(Collectors.toList());
	}

	private BookData entityToData(Book book) {
		return new BookData(book.getIdBook(), book.getNameBook(), book.getImagen(), book.getPrice(),
				book.getQuantity());
	}

}
