package com.exercise.cave.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaCustomSearchDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.dto.TarifaFormatedDTO;
import com.exercise.cave.repository.TarifaRepository;
import com.exercise.cave.repository.mapper.TarifaMapper;
import com.exercise.cave.service.TarifaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarifaServiceImpl implements TarifaService {

    private final TarifaRepository tarifaRepository;
    private final TarifaMapper tarifaMapper;

    @Override
    public TarifaDTO createTarifaDTO(CreateTarifaDTO createTarifaDTO) {
        return this.tarifaMapper.asModel(this.tarifaRepository.save(
            this.tarifaMapper.asEntityFromCreateTarifaDTO(createTarifaDTO)
        ));
    }

    @Override
    public List<TarifaDTO> updateTarifaPrice(TarifaDTO tarifaDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTarifaPrice'");
    }

    @Override
    public TarifaFormatedDTO getTarifaById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTarifaById'");
    }

    @Override
    public void deleteTarifaById(Integer id) {
        this.tarifaRepository.deleteById(id);
    }

    @Override
    public List<TarifaFormatedDTO> getTarifaByDateProductoMarca(TarifaCustomSearchDTO tarifaCustomSearchDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTarifaByDateProductoMarca'");
    }
    
}
