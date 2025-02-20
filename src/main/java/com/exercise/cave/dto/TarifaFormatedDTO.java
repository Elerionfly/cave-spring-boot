package com.exercise.cave.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarifaFormatedDTO {
    
    private Integer id;
    private Integer brandId;
    private Integer productId;
    private String fechaInicio;
    private String fechaFin;
    private String precioFormateado;
}
