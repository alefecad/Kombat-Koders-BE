package com.petsupermarket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petsupermarket.app.entity.Categorias;
import com.petsupermarket.app.repository.CategoriasRepository;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriasController {
	private final CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasController(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}
	
	//EndPoint para obtener todos los tipos de categoria
	@GetMapping
	public Iterable<Categorias>getCategorias(){
		return categoriasRepository.findAll();
	}
	
	//EndPoint para obtener un tipo de categoria por ID
	@GetMapping("{id}")
	public Categorias getCategoriasById(@PathVariable Long id) {
		return categoriasRepository.findById(id).orElse(null);
	}
	
	//EndPoint para crear un nuevo tipo de categoria
	@PostMapping
	public Categorias createCategorias(@RequestBody Categorias categorias) {
		return categoriasRepository.save(categorias);
	}
	
	//EndPoint para actualizar un tipo de categorias existente
	@PutMapping("{id}")
	public Categorias updateCategorias(@PathVariable Long id, @RequestBody Categorias categorias) {
		categorias.setId(id);
		return categoriasRepository.save(categorias);
	}
	
	//EndPoint para eliminar por ID
	@DeleteMapping("{id}")
	public void deleteCategorias(@PathVariable Long id) {
		categoriasRepository.deleteById(id);
	}
}
