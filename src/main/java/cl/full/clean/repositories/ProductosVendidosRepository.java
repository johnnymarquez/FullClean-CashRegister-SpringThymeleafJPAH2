package cl.full.clean.repositories;

import cl.full.clean.model.ProductoVendido;
import org.springframework.data.repository.CrudRepository;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
