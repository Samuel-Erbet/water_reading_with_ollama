package com.example.samuel.water_reading_with_ollama.controller;

import com.example.samuel.water_reading_with_ollama.repository.MeasureRepository;
import com.example.samuel.water_reading_with_ollama.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/measure")
public class MeasureController {

    @Autowired
    MeasureService service;

    MeasureRepository repository;

    @PostMapping("/")
    public void measure(){

    }

}
