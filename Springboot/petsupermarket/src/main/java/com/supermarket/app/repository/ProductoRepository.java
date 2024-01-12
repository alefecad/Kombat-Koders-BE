package com.petsupermarket.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository CrudRepository<Usuario, Long>{

	Optional<Producto> findByNombre(String nombre);
}
