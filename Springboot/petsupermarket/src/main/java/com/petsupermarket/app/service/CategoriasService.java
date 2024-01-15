package com.petsupermarket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.Categorias;
import com.petsupermarket.app.repository.CategoriasRepository;

@Service
public class CategoriasService {
	CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasService(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}
	
	 // Método para obtener todas las categorías
    public Iterable<Categorias> getAllCategorias() {
        return categoriasRepository.findAll();
    }
}	
