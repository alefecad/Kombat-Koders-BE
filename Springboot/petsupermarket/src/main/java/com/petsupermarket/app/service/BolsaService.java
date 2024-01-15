package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface BolsaService {
    List<Bolsa> obtenerTodasBolsas();
    Optional<Bolsa> obtenerBolsaPorId(Long id);
    List<Bolsa> obtenerBolsasPorUsuario(Usuario usuario);
    Bolsa crearBolsa(Bolsa bolsa);
    Optional<Bolsa> actualizarBolsa(Long id, Bolsa bolsa);
    void eliminarBolsa(Long id);
}
