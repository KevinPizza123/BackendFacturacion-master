package ec.edu.epn.repository.schema;


import ec.edu.epn.model.entities.schema.Concepto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConceptoRepository extends JpaRepository<Concepto, Integer> {
}
