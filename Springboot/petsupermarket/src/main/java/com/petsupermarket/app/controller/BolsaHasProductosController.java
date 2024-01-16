package com.petsupermarket.app.controller;

import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.service.BolsaHasProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/bolsa-has-productos")
public class BolsaHasProductosController {
    
	@Autowired
    BolsaHasProductosService bolsaHasProductosService;
   
    public BolsaHasProductosController(BolsaHasProductosService bolsaHasProductosService) {
        this.bolsaHasProductosService = bolsaHasProductosService;
    }

    @GetMapping("{id}")
    public Optional<BolsaHasProductos> getBolsaHasProductosById(@PathVariable Long id) {
        return bolsaHasProductosService.getBolsaHasProductosById(id);
    }

    @GetMapping
    public List<BolsaHasProductos> getAllBolsaHasProductos() {
        return bolsaHasProductosService.getAllBolsaHasProductos();
    }

    @PostMapping("save")
    public void saveBolsaHasProductos(@RequestBody BolsaHasProductos bolsaHasProductos) {
        bolsaHasProductosService.saveBolsaHasProductos(bolsaHasProductos);
    }

    @DeleteMapping("delete/{id}")
    public void deleteBolsaHasProductos(@PathVariable Long id) {
        bolsaHasProductosService.deleteBolsaHasProductos(id);
    }
}
