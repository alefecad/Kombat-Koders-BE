package com.petsupermarket.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.Producto;
import com.petsupermarket.app.repository.ProductoRepository;
import com.petsupermarket.app.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto getProductoById(Long id) {
		Optional<Producto> existingProducto = productoRepository.findById(id);
		if (existingProducto.isPresent()) return existingProducto.get();
		else throw new IllegalStateException("Producto does not exist");
	}

	@Override
	public List<Producto> getAllProductos() {
		List<Producto> productos = (List<Producto>) productoRepository.findAll();
		return productos;
	}
	
	@Override
	public Producto createProducto(Producto producto) {
		producto.setId(null); // Evita que llegue un ID al back para forzar al sonsecutivo
		Producto newProducto = productoRepository.save(producto);
		return newProducto;
	}

	@Override
	public Producto updateProducto(Producto producto, Long id) {
		Producto existingProducto = getProductoById(id);
		existingProducto.setCategoria(producto.getCategoria());
		existingProducto.setContenido(producto.getContenido());
		existingProducto.setDescripcion(producto.getDescripcion());
		existingProducto.setDescuento(producto.getDescuento());
		existingProducto.setExistencia(producto.getExistencia());
		existingProducto.setImagen(producto.getImagen());
		existingProducto.setMarca(producto.getMarca());
		existingProducto.setNombre(producto.getNombre());
		existingProducto.setPrecio(producto.getPrecio());
		existingProducto.setTipoProducto(producto.getTipoProducto());
		return productoRepository.save(existingProducto);
	}

	@Override
	public void deleteProducto(Long id) {
		Producto existingProducto = getProductoById(id);
		existingProducto.setExistencia(0);
		productoRepository.save(existingProducto);
	}

}
