package com.petsupermarket.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.Usuario;

import java.util.List;

public interface BolsaRepository extends CrudRepository<Bolsa, Long> {
    Bolsa findByUsuario(Usuario usuario);
    List<Bolsa> findAllByUsuario(Usuario usuario);
}
