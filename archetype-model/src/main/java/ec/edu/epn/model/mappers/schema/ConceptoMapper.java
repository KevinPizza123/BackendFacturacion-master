package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.ConceptoDto;
import ec.edu.epn.model.dto.schema.PagoDto;
import ec.edu.epn.model.entities.schema.Concepto;
import ec.edu.epn.model.entities.schema.Pagos;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface ConceptoMapper extends EntityMapper<ConceptoDto, Concepto> {

    @Override
    Concepto toEntity(ConceptoDto dto);

    @Override
    List<Concepto> toEntity(List<ConceptoDto> dtoList);

    @Override
    ConceptoDto toDto(Concepto entity);

    @Override
    List<ConceptoDto> toDto(List<Concepto> entityList);

    @Override
    Set<ConceptoDto> toDto(Set<Concepto> entityList);
}
