package ec.edu.epn.service.impl.schema;


import ec.edu.epn.model.dto.schema.CentroCostoDto;
import ec.edu.epn.model.mappers.schema.CentroCostoMapper;
import ec.edu.epn.repository.schema.CentroCostoRepository;
import ec.edu.epn.service.service.schema.CentroCostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CentroCostoServiceImpl implements CentroCostoService {
    @Autowired
    private CentroCostoRepository repository;

    @Autowired
    private CentroCostoMapper mapper;


    @Override
    public CentroCostoDto create(CentroCostoDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<CentroCostoDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public CentroCostoDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
