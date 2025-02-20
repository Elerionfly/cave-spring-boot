package com.exercise.cave.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaCustomSearchDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.dto.TarifaFormatedDTO;
import com.exercise.cave.repository.TarifaRepository;
import com.exercise.cave.repository.mapper.TarifaMapper;
import com.exercise.cave.service.TarifaService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
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
    public TarifaDTO updateTarifaPrice(TarifaDTO tarifaDTO) {
        return this.tarifaMapper.asModel(this.tarifaRepository.save(
            this.tarifaMapper.asEntity(tarifaDTO)
        ));
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
