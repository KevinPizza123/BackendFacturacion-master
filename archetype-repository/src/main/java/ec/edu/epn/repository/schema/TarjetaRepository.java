package ec.edu.epn.repository.schema;

import ec.edu.epn.model.entities.schema.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {
}
