package com.petsupermarket.app.service;

import java.util.List;

import com.petsupermarket.app.entity.Producto;

public interface ProductoService {
	Producto getProductoById(Long id);
	List<Producto> getAllProductos();
	Producto createProducto(Producto producto);
	Producto updateProducto(Producto producto, Long id);
	void deleteProducto(Long id);
}
