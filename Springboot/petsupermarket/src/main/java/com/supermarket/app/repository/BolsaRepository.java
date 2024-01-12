package com.supermarket.app.repository;

import com.supermarket.app.entity.Bolsa;
import com.supermarket.app.entity.usuario;  // Asegúrate de importar la clase Usuario
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BolsaRepository extends CrudRepository<Bolsa, Long> {
    Bolsa findByUsuario(usuario usuario);
    List<Bolsa> findAllByUsuario(usuario usuario);
}
