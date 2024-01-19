package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.BolsaHasProductos;

import java.util.List;
import java.util.Optional;

public interface BolsaHasProductosService {

    Optional<BolsaHasProductos> getBolsaHasProductosById(Long id);

    List<BolsaHasProductos> getAllBolsaHasProductos();  // Corregir el tipo de retorno

    BolsaHasProductos saveBolsaHasProductos(BolsaHasProductos bolsaHasProductos);

    void deleteBolsaHasProductos(Long id);
}
