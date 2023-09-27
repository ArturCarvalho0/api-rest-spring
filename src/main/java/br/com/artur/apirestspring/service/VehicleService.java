package br.com.artur.apirestspring.service;

import br.com.artur.apirestspring.dto.VehicleDTO;
import br.com.artur.apirestspring.exception.ResourceNotFoundException;
import br.com.artur.apirestspring.mapper.CustomModelMapper;
import br.com.artur.apirestspring.model.VehicleModel;
import br.com.artur.apirestspring.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public VehicleDTO create(VehicleDTO dto) {
        VehicleModel model = CustomModelMapper.parseObject(dto, VehicleModel.class);
        return CustomModelMapper.parseObject(repository.save(model), VehicleDTO.class);
    }

    public VehicleDTO findById(int id) {
        VehicleModel model = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(null));
        return CustomModelMapper.parseObject(model, VehicleDTO.class);
    }

    public List<VehicleDTO> findAll() {
        List<VehicleModel> list = repository.findAll();
        return CustomModelMapper.parseObjectList(list, VehicleDTO.class);
    }

    public VehicleDTO update(VehicleDTO dto) {
        VehicleModel model = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(null));
        model = CustomModelMapper.parseObject(dto, VehicleModel.class);
        return CustomModelMapper.parseObject(repository.save(model), VehicleDTO.class);
    }

    public void delete(VehicleDTO dto) {
        VehicleModel model = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(null));
        repository.delete(model);
    }
}
