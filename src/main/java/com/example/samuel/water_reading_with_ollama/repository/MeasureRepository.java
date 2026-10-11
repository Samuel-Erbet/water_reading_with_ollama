package com.example.samuel.water_reading_with_ollama.repository;

import com.example.samuel.water_reading_with_ollama.Entity.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
}
