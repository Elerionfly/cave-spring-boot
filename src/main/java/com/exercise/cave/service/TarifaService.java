package com.exercise.cave.service;

import java.util.List;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaCustomSearchDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.dto.TarifaFormatedDTO;

public interface TarifaService {
    
    /**
     * Llamada al service-impl para crear una tarifa
     * @param createTarifaDTO
     * @return tarifaDTO
     */
    public TarifaDTO createTarifaDTO(CreateTarifaDTO createTarifaDTO);
    
    /**
     * Método para actualizar una o varias tarifas
     * @param tarifaDTO
     * @return devuelve una lista de las distintas tarifas actualizadas
     */
    public List<TarifaDTO> updateTarifaPrice(TarifaDTO tarifaDTO);

    /**
     * Método para buscar una tarifa por Id
     * @param id
     * @return devuelve la tarifa encontrada
     */
    public TarifaFormatedDTO getTarifaById(Integer id);

    /**
     * Método para borrar una tarifa por Id
     * @param id
     */
    public void deleteTarifaById(Integer id);

    /**
     * Método para buscar una tarifa por su fecha y/o producto y/o marca
     * @param tarifaCustomSearchDTO
     * @return Una lista de las tarifas encontradas
     */
    public List<TarifaFormatedDTO> getTarifaByDateProductoMarca(TarifaCustomSearchDTO tarifaCustomSearchDTO);

}
