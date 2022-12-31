package cl.full.clean.repositories;

import cl.full.clean.model.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
