package com.exercise.cave.controller;

import org.springframework.web.bind.annotation.RestController;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaCustomSearchDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.dto.TarifaFormatedDTO;
import com.exercise.cave.service.TarifaService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequiredArgsConstructor
public class TarifaController {
    
    private final TarifaService tarifaService;

    @PostMapping("/V1/tarifa")
    public ResponseEntity<TarifaDTO> createTarifa(@RequestBody CreateTarifaDTO entity) {
        System.out.println(entity.getCodMoneda());
        return ResponseEntity.ok(this.tarifaService.createTarifaDTO(entity));
    }

    @PutMapping("/V1/tarifa")
    public ResponseEntity<List<TarifaDTO>> updateTarifaPrice(@RequestBody TarifaDTO entity) {
        System.out.println(entity.getFechaInicio());        
        return null;
    }
    
    @GetMapping("/V1/tarifa/{id}")
    public ResponseEntity<TarifaFormatedDTO> getTarifaById(@PathVariable("id") Integer id) {
        System.out.println(id);
        return ResponseEntity.ok(new TarifaFormatedDTO());
    }

    @DeleteMapping("/V1/tarifa/{id}")
    public void deleteTarifaById(@PathVariable("id") Integer id) {
        this.tarifaService.deleteTarifaById(id);
    }

    @PostMapping("/V1/tarifa/customSearch")
    public ResponseEntity<List<TarifaFormatedDTO>> getTarifaByDateProductoMarca(@RequestBody TarifaCustomSearchDTO entity) {
        System.out.println(entity.getFechaFiltro());
        return null;
    }
    
    
}
