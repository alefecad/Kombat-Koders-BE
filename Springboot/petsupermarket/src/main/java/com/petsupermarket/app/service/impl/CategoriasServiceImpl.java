package com.petsupermarket.app.service.impl;

import com.petsupermarket.app.entity.Categorias;
import com.petsupermarket.app.repository.CategoriasRepository;
import com.petsupermarket.app.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriasServiceImpl implements CategoriasService {

    private final CategoriasRepository categoriasRepository;

    @Autowired
    public CategoriasServiceImpl(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    @Override
    public Iterable<Categorias> getAllCategorias() {
        return categoriasRepository.findAll();
    }

    @Override
    public Optional<Categorias> getCategoriaById(Long id) {
        return categoriasRepository.findById(id);
    }

    @Override
    public Categorias createCategoria(Categorias categoria) {
        return categoriasRepository.save(categoria);
    }

    @Override
    public Categorias updateCategoria(Long id, Categorias categoria) {
        categoria.setId(id);
        return categoriasRepository.save(categoria);
    }

    @Override
    public void deleteCategoria(Long id) {
        categoriasRepository.deleteById(id);
    }
}

