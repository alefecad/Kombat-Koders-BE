package com.petsupermarket.app.controller;

<<<<<<< HEAD
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
=======

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.service.TipoProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/tipoProductos")

public class TipoProductoController{
	
	@Autowired
	TipoProductoService tipoProductoService;
	
	 @GetMapping("{id}")
	    public TipoProducto getTipoProductoById(@PathVariable Long id) {
	        return tipoProductoService.getTipoProductoById(id);
	    }
	
	@GetMapping 
	List<TipoProducto> getAllTipoProductos(){
		List<TipoProducto> tipoProductos = TipoProductoService.getAllTipoProductos();
		return tipoProductos;
	}
	
	@GetMapping("tipoProducto")
    public TipoProducto getTipoProductoByTipo(@RequestParam String tipoProducto) {
        return tipoProductoService.getTipoProductoByTipoProducto(tipoProducto);
    }	
	
}


>>>>>>> TipoProducto
