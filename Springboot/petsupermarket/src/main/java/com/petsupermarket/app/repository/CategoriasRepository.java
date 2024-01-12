package com.petsupermarket.app.repository;

import java.util.Optional;

import com.petsupermarket.app.entity.Categorias;
import org.springframework.data.repository.CrudRepository;

public interface CategoriasRepository extends CrudRepository<Categorias, Long>{
	 Optional<Categorias> findById(int id);
}
