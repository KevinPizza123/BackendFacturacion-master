package ec.edu.epn.service.impl.schema;

import ec.edu.epn.model.dto.schema.ConceptoDto;
import ec.edu.epn.model.mappers.schema.ConceptoMapper;
import ec.edu.epn.model.mappers.schema.PagosMapper;
import ec.edu.epn.repository.schema.ConceptoRepository;
import ec.edu.epn.repository.schema.PagosRepository;
import ec.edu.epn.service.service.schema.ConceptoService;
import ec.edu.epn.service.service.schema.PagosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ConceptoServiceImpl implements ConceptoService {


    @Autowired
    private ConceptoRepository repository;

    @Autowired
    private ConceptoMapper mapper;


    @Override
    public ConceptoDto create(ConceptoDto obj) {
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
    }

    @Override
    public List<ConceptoDto> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public ConceptoDto findById(Integer id) {
        return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return repository.findById(id).isPresent();
    }
}
