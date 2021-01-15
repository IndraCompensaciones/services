/**
 * 
 */
package co.com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.book.data.BookData;
import co.com.book.service.BookServices;

/**
 * @RestController de la operacion que consulta libros
 * @author Administrador
 *
 */
@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookServices service;

	@CrossOrigin
	@GetMapping("/get")
	public List<BookData> getBook() {
		return service.getListBook();

	}

}
