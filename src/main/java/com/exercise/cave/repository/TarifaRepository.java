package com.exercise.cave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.cave.model.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {
    
} 
