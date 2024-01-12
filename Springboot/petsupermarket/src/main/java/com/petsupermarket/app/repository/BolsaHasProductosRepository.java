package com.petsupermarket.app.repository;

import java.util.Optional;
import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.entity.Producto;
import org.springframework.data.repository.CrudRepository;


public interface BolsaHasProductosRepository extends CrudRepository<BolsaHasProductos, Long>{
	Optional<BolsaHasProductos> findBolsaHasProductosById(int id);
	Optional<Bolsa> findBolsaById(int id);
	Optional<Producto> findProductoById(int id);
}
