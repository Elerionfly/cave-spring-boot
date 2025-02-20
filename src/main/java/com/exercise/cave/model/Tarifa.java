package com.exercise.cave.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "T_RATES")
@Data
public class Tarifa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "ratesGen", sequenceName = "t_rates_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ratesGen")
    private Integer id;
    
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "start_date")
    private Date fechaInicio;

    @Column(name = "end_date")
    private Date fechaFin;

    @Column(name = "price")
    private Integer precio;

    @Column(name = "currency_code")
    private String codMoneda;
}
