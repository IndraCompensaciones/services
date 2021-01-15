/**
 * 
 */
package co.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import co.com.sale.model.Sale;

/**
 * Repositorio para la entidad Sale
 * @author Administrador
 *
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
