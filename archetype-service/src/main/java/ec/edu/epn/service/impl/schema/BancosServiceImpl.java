package ec.edu.epn.service.impl.schema;


import ec.edu.epn.model.dto.schema.BancosDto;
import ec.edu.epn.model.mappers.schema.BancosMapper;
import ec.edu.epn.repository.schema.BancosRepository;
import ec.edu.epn.service.service.schema.BancosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BancosServiceImpl implements BancosService {

    @Autowired
    private BancosRepository repository;

    @Autowired
    private BancosMapper mapper;


    @Override
    public BancosDto create(BancosDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<BancosDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public BancosDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
