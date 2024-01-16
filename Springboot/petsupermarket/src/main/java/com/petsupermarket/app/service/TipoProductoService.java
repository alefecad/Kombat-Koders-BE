package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.TipoProducto;

import java.util.Optional;

public interface TipoProductoService {
	
	Iterable<TipoProducto> getAllTipoProducto();
	Optional<TipoProducto> getTipoProducto(Long id);
	TipoProducto createTipoProducto(TipoProducto tipoProducto);
	TipoProducto updateTipoProducto(Long id, TipoProducto tipoProducto);
	void deleteTipoProducto(Long id);
}