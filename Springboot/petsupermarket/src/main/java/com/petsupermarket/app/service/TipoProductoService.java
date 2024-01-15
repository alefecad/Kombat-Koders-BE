package com.petsupermarket.app.service;

import java.util.List;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoService {
	
	TipoProducto getTipoProductoById(Long id);
	TipoProducto getTipoProductoByTipoProducto(String tipoProducto);
	static List<TipoProducto> getAllTipoProductos() {
		return null;
	}
	TipoProducto getUserByTipoProducto(Long id);
}
 
