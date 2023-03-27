package ec.edu.epn.service.impl.schema;



import ec.edu.epn.model.dto.schema.TarjetaDTO;
import ec.edu.epn.model.mappers.schema.TarjetaMapper;
import ec.edu.epn.repository.schema.TarjetaRepository;
import ec.edu.epn.service.service.schema.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    private TarjetaRepository repository;

    @Autowired
    private TarjetaMapper mapper;


    @Override
    public TarjetaDTO create(TarjetaDTO obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<TarjetaDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public TarjetaDTO findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
