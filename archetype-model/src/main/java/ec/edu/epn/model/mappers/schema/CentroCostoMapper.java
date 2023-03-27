package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.CentroCostoDto;
import ec.edu.epn.model.entities.schema.CentroCosto;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
@Component
public interface CentroCostoMapper extends EntityMapper<CentroCostoDto, CentroCosto> {
    @Override
    CentroCosto toEntity(CentroCostoDto dto);

    @Override
    List<CentroCosto> toEntity(List<CentroCostoDto> dtoList);

    @Override
    CentroCostoDto toDto(CentroCosto entity);

    @Override
    List<CentroCostoDto> toDto(List<CentroCosto> entityList);

    @Override
    Set<CentroCostoDto> toDto(Set<CentroCosto> entityList);
}
