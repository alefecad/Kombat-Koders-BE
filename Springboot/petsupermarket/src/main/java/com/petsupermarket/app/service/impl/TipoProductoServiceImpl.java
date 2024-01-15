package com.petsupermarket.app.service.impl;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;
import com.petsupermarket.app.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoProductoServiceImpl implements TipoProductoService {

    private final TipoProductoRepository tipoProductoRepository;

    // Constructor que utiliza la inyección de dependencias para obtener el repositorio
    @Autowired
    public TipoProductoServiceImpl(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    // Método para obtener todos los tipos de productos
    @Override
    public Iterable<TipoProducto> getAllTiposProductos() {
        return tipoProductoRepository.findAll();
    }

    // Método para obtener un tipo de producto por su ID
    @Override
    public Optional<TipoProducto> getTipoProductoById(Long id) {
        return tipoProductoRepository.findById(id);
    }

    // Método para crear un nuevo tipo de producto
    @Override
    public TipoProducto createTipoProducto(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    // Método para actualizar un tipo de producto existente
    @Override
    public TipoProducto updateTipoProducto(Long id, TipoProducto tipoProducto) {
        tipoProducto.setId(id);
        return tipoProductoRepository.save(tipoProducto);
    }

    // Método para eliminar un tipo de producto por su ID
    @Override
    public void deleteTipoProducto(Long id) {
        tipoProductoRepository.deleteById(id);
    }
}

