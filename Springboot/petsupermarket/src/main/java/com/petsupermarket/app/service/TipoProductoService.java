package com.petsupermarket.app.service;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoService {

	TipoProducto getUserByTipoProducto(Long id);
	TipoProducto getTipoProductoById(Long id);
	TipoProducto crearTipoProducto(TipoProducto tipoProducto);
	TipoProducto getTipoProductoByTipoProducto(String tipoProducto);
	void eliminarTipoProducto(Long id);
	Optional<TipoProducto> actualizarTipoProducto(Long id, TipoProducto tipoProducto);
	 default List<TipoProducto> getAllTipoProductos() {
		return null;
	}
	
}
 
=======
import com.petsupermarket.app.entity.TipoProducto;

import java.util.Optional;

public interface TipoProductoService {

    Iterable<TipoProducto> getAllTiposProductos();

    Optional<TipoProducto> getTipoProductoById(Long id);

    TipoProducto createTipoProducto(TipoProducto tipoProducto);

    TipoProducto updateTipoProducto(Long id, TipoProducto tipoProducto);

    void deleteTipoProducto(Long id);
}

>>>>>>> equipo2_tarea13
