package com.petsupermarket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;

@RestController
@RequestMapping("api/v1/tipoProducto")
public class TipoProductoController {
	TipoProductoRepository tipoProductoRepository;
	
	@Autowired
    public TipoProductoController(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }
	// Endpoint para obtener todos los tipos de productos
    @GetMapping
    public Iterable<TipoProducto> getTiposProductos() {
        return tipoProductoRepository.findAll();
    }
}
