package com.supermarket.app.repository;

import com.supermarket.app.entity.Bolsa;
import com.supermarket.app.entity.Usuario;  // Asegúrate de importar la clase Usuario
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BolsaRepository extends CrudRepository<Bolsa, Long> {
    Bolsa findByUsuario(Usuario usuario);
    List<Bolsa> findAllByUsuario(Usuario usuario);
}
