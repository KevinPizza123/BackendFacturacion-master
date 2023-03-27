package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.FormaPagoDto;
import ec.edu.epn.model.dto.schema.PagoDto;
import ec.edu.epn.model.entities.schema.FormaPago;
import ec.edu.epn.model.entities.schema.Pagos;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface PagosMapper extends EntityMapper<PagoDto, Pagos> {

    @Override
    Pagos toEntity(PagoDto dto);

    @Override
    List<Pagos> toEntity(List<PagoDto> dtoList);

    @Override
    PagoDto toDto(Pagos entity);

    @Override
    List<PagoDto> toDto(List<Pagos> entityList);

    @Override
    Set<PagoDto> toDto(Set<Pagos> entityList);
}


