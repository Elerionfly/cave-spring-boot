package com.exercise.cave.repository.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.exercise.cave.dto.CreateTarifaDTO;
import com.exercise.cave.dto.TarifaDTO;
import com.exercise.cave.model.Tarifa;

@Mapper(componentModel = "spring")
public interface TarifaMapper {
    
    // Convertir a Model
    @Mapping(target = "fechaFin", source = "fechaFin", qualifiedByName = "convertirFechaString")
    @Mapping(target = "fechaInicio", source = "fechaInicio", qualifiedByName = "convertirFechaString")
    public Tarifa asEntity(TarifaDTO src);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "fechaFin", source = "fechaFin", qualifiedByName = "convertirFechaString")
    @Mapping(target = "fechaInicio", source = "fechaInicio", qualifiedByName = "convertirFechaString")
    public Tarifa asEntityFromCreateTarifaDTO(CreateTarifaDTO src);

    // Convertir a DTO
    @Mapping(target = "fechaFin", source = "fechaFin", qualifiedByName = "parsearFechaDate")
    @Mapping(target = "fechaInicio", source = "fechaInicio", qualifiedByName = "parsearFechaDate")
    public TarifaDTO asModel(Tarifa src);

    @Named("convertirFechaString")
    public static Date convertirFechaString(String date) {
        if (date == null) return null;
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("Invalid date format: " + date);
        }
    }

    @Named("parsearFechaDate")
    public static String parsearFechaDate(Date date) {
        if (date == null) return null;
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

}
