package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.BancosDto;
import ec.edu.epn.model.entities.schema.Bancos;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;


@Mapper(componentModel = "spring")
@Component
public interface BancosMapper extends EntityMapper<BancosDto, Bancos>{

    @Override
    Bancos toEntity(BancosDto dto);

    @Override
    List<Bancos> toEntity(List<BancosDto> dtoList);

    @Override
    BancosDto toDto(Bancos entity);

    @Override
    List<BancosDto> toDto(List<Bancos> entityList);

    @Override
    Set<BancosDto> toDto(Set<Bancos> entityList);

}
