package com.petsupermarket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petsupermarket.app.entity.Categorias;
import com.petsupermarket.app.repository.CategoriasRepository;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriasController {
	CategoriasRepository categoriasRepository = null;
	@Autowired
    public void CategoriasRepository(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }
	
	@GetMapping
	public Iterable<Categorias> getCategorias() {
        return categoriasRepository.findAll();
    }
}
