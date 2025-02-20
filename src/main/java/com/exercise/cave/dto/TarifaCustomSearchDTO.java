package com.exercise.cave.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarifaCustomSearchDTO {

    private String fechaFiltro;

    private Integer brandId;

    private Integer productId;
}