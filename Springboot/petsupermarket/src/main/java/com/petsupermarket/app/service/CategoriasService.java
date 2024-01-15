package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.Categorias;

import java.util.Optional;

public interface CategoriasService {

    Iterable<Categorias> getAllCategorias();

    Optional<Categorias> getCategoriaById(Long id);

    Categorias createCategoria(Categorias categoria);

    Categorias updateCategoria(Long id, Categorias categoria);

    void deleteCategoria(Long id);
}
