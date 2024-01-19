package com.petsupermarket.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petsupermarket.app.entity.Producto;
import com.petsupermarket.app.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping()
	List<Producto> getAllProductos(){
		return productoService.getAllProductos();
	}
	
	@GetMapping("{id}")
	Producto getProductoById(@PathVariable("id") Long id){
		Producto producto = productoService.getProductoById(id);
		return producto;
	}
	
	@GetMapping("existing")
	List<Producto> getAllProductosExisting(){
		List<Producto> productos = productoService.getAllProductos();
		productos.removeIf(producto -> (producto.getExistencia()<=0));
		return productos;
	}
	
	@PostMapping()
	Producto setProducto(@RequestBody Producto producto) {
		Producto newProducto = productoService.createProducto(producto);
		return newProducto;
	}
	
	@PutMapping("{id}")
	Producto updateProducto(@RequestBody Producto producto, @PathVariable("id") Long id) {
		return productoService.updateProducto(producto, id);
	}
		
	@DeleteMapping("{id}")
	String deleteProducto(@PathVariable("id") Long id) {
		productoService.deleteProducto(id);
		return "Se eliminó el producto con id: "+id ;
	}
}
