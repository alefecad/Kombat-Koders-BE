package com.petsupermarket.app.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.petsupermarket.app.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

	Optional<Producto> findById(Long id);
	
}
