package com.petsupermarket.app.repository;

import java.util.Optional;
import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.entity.Producto;
import org.springframework.data.repository.CrudRepository;


public interface BolsaHasProductosRepository extends CrudRepository<BolsaHasProductos, Long>{
	Optional<BolsaHasProductos> findById(int id);
	Optional<Bolsa> findById(int id);
	Optional<Producto> findById(int id);
}
