package com.petsupermarket.app.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.petsupermarket.app.entity.Producto;
import com.petsupermarket.app.entity.Usuario;

public interface ProductoRepository extends CrudRepository<Usuario, Long>{

	Optional<Producto> findByNombre(String nombre);
}
