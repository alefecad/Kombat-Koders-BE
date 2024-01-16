package com.petsupermarket.app.service.impl;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;
import com.petsupermarket.app.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TipoProductoServiceImpl implements TipoProductoService{
	final TipoProductoRepository tipoProductoRepository;

    @Autowired
    public TipoProductoServiceImpl(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    @Override
    public Iterable<TipoProducto> getAllTipoProducto() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public Optional<TipoProducto> getTipoProducto(Long id) {
        return tipoProductoRepository.findById(id);
    }

    @Override
    public TipoProducto createTipoProducto(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public TipoProducto updateTipoProducto(Long id, TipoProducto tipoProducto) {
        tipoProducto.setId(id);
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public void deleteTipoProducto(Long id) {
        tipoProductoRepository.deleteById(id);
    }
}