package com.supermarket.app.repository;

import com.supermarket.app.entity.Categorias;
import com.supermarket.app.entity.TipoProducto;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TipoProductoRepository extends CrudRepository<TipoProducto, Long> {
    TipoProducto findByTipoProducto(String tipoProducto);
	List<TipoProducto> findByCategoria(Categorias categoria);


}