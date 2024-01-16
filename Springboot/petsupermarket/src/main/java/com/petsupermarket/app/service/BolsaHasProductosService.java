package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.BolsaHasProductos;
import java.util.List;
import java.util.Optional;

public interface BolsaHasProductosService {

    BolsaHasProductos getBolsaHasProductosById(Long id);
    BolsaHasProductos getBolsaHasProductosByUsuario(String usuario);
    Optional <BolsaHasProductos> getAllBolsaHasProductos();
    // void saveBolsaHasProductos(BolsaHasProductos bolsaHasProductos);
    // void deleteBolsaHasProductos(Long id);
    
}