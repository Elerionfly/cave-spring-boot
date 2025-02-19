package com.exercise.cave.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/V1/tarifa")
@Tag(name = "Tarifas API", description = "Esta es la API de tarifas")
public class TarifaController {
    
    @Operation(summary = "Prueba")
    @PostMapping("/V1/tarifa")
    public String createTarifa(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
