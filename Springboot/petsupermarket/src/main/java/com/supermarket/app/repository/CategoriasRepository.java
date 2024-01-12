package com.petsupermarket.app.repository;

import java.util.Optional;

import org.generation.app.entity.Categorias;
import org.springframework.data.repository.CrudRepository;

public interface CategoriasRepository extends CrudRepository<Categorias, Long>{
	 Optional<Categorias> findById(int id);
}
