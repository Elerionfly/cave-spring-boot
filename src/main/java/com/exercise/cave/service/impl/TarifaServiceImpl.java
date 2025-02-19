package com.exercise.cave.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaCustomSearchDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.dto.TarifaFormatedDTO;
import com.exercise.cave.service.TarifaService;

@Service
public class TarifaServiceImpl implements TarifaService {

    @Override
    public TarifaDTO createTarifaDTO(CreateTarifaDTO createTarifaDTO) {
        return new TarifaDTO();
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTarifaById'");
    }

    @Override
    public List<TarifaFormatedDTO> getTarifaByDateProductoMarca(TarifaCustomSearchDTO tarifaCustomSearchDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTarifaByDateProductoMarca'");
    }
    
}
