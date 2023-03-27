package ec.edu.epn.repository.schema;

import ec.edu.epn.model.entities.schema.FormaPago;
import ec.edu.epn.model.entities.schema.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagosRepository extends JpaRepository<Pagos, Integer> {
}
