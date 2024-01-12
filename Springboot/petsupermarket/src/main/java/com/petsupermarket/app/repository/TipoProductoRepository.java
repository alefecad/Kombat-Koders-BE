package com.petsupermarket.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.petsupermarket.app.entity.Categorias;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoRepository extends CrudRepository<TipoProducto, Long> {
    TipoProducto findByTipoProducto(String tipoProducto);
	List<TipoProducto> findByCategoria(Categorias categoria);


}