package com.supermarket.app.controller;

import com.supermarket.app.entity.Bolsa;
import com.supermarket.app.repository.BolsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bolsa")
public class BolsaController {

    final BolsaRepository bolsaRepository;

    @Autowired
    public BolsaController(BolsaRepository bolsaRepository) {
        this.bolsaRepository = bolsaRepository;
    }

    @GetMapping
    public Iterable<Bolsa> getBolsa() {
        return bolsaRepository.findAll();
    }
}