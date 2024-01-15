package com.petsupermarket.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoRepository extends CrudRepository<TipoProducto, Long> {
    TipoProducto findByTipoProducto(String tipoProducto);

}