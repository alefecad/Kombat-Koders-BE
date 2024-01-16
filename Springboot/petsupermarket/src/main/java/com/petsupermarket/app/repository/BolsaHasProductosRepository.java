package com.petsupermarket.app.repository;

import java.util.Optional;
import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.entity.Producto;
import com.petsupermarket.app.entity.compositeKey.BolsaHasProductosKey;

import org.springframework.data.repository.CrudRepository;


public interface BolsaHasProductosRepository extends CrudRepository<BolsaHasProductos, Long>{
	// Optional<BolsaHasProductos> findByBolsa(Long id);
	// Optional<BolsaHasProductos> findByProducto(Long id);
}
