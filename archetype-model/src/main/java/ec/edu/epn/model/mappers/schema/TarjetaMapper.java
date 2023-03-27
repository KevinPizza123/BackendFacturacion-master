package ec.edu.epn.model.mappers.schema;

import ec.edu.epn.model.dto.schema.TarjetaDTO;
import ec.edu.epn.model.entities.schema.Tarjeta;
import ec.edu.epn.model.mappers.EntityMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;


@Mapper(componentModel = "spring")
@Component
public interface TarjetaMapper extends EntityMapper<TarjetaDTO, Tarjeta> {

    @Override
    Tarjeta toEntity(TarjetaDTO dto);

    @Override
    List<Tarjeta> toEntity(List<TarjetaDTO> dtoList);

    @Override
    TarjetaDTO toDto(Tarjeta entity);

    @Override
    List<TarjetaDTO> toDto(List<Tarjeta> entityList);

    @Override
    Set<TarjetaDTO> toDto(Set<Tarjeta> entityList);
}
