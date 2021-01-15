/**
 * 
 */
package co.com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.book.model.Book;

/**
 * Repositorio de la entidad de libros
 * @author Administrador
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
