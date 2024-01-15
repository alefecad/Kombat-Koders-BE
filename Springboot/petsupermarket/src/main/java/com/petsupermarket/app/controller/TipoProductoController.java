package com.petsupermarket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;

@RestController
@RequestMapping("api/v1/tipoProducto")
public class TipoProductoController {

    private final TipoProductoRepository tipoProductoRepository;

    @Autowired
    public TipoProductoController(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    // Endpoint para obtener todos los tipos de productos
    @GetMapping
    public Iterable<TipoProducto> getTiposProductos() {
        return tipoProductoRepository.findAll();
    }

    // Endpoint para obtener un tipo de producto por su ID
    @GetMapping("/{id}")
    public TipoProducto getTipoProductoById(@PathVariable Long id) {
        return tipoProductoRepository.findById(id).orElse(null);
    }

    // Endpoint para crear un nuevo tipo de producto
    @PostMapping
    public TipoProducto createTipoProducto(@RequestBody TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    // Endpoint para actualizar un tipo de producto existente
    @PutMapping("/{id}")
    public TipoProducto updateTipoProducto(@PathVariable Long id, @RequestBody TipoProducto tipoProducto) {
        tipoProducto.setId(id);
        return tipoProductoRepository.save(tipoProducto);
    }

    // Endpoint para eliminar un tipo de producto por su ID
    @DeleteMapping("/{id}")
    public void deleteTipoProducto(@PathVariable Long id) {
        tipoProductoRepository.deleteById(id);
    }
}
