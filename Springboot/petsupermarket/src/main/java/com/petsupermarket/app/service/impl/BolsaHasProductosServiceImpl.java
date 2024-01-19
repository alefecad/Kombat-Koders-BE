package com.petsupermarket.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.repository.BolsaHasProductosRepository;
import com.petsupermarket.app.service.BolsaHasProductosService;

@Service
public class BolsaHasProductosServiceImpl implements BolsaHasProductosService {

    @Autowired
    BolsaHasProductosRepository bolsaHasProductosRepository;

    @Override
    public Optional<BolsaHasProductos> getBolsaHasProductosById(Long id) {
        return bolsaHasProductosRepository.findById(id);
    }

    @Override
    public List<BolsaHasProductos> getAllBolsaHasProductos() {
        return (List<BolsaHasProductos>) bolsaHasProductosRepository.findAll();
    }

    @Override
    public BolsaHasProductos saveBolsaHasProductos(BolsaHasProductos bolsaHasProductos) {
    return bolsaHasProductosRepository.save(bolsaHasProductos);
    }

    @Override
    public void deleteBolsaHasProductos(Long id) {
        bolsaHasProductosRepository.deleteById(id);
    }
}
