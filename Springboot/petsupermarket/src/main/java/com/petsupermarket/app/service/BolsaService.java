package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.Usuario;
import com.petsupermarket.app.repository.BolsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BolsaService {

    @Autowired
    private BolsaRepository bolsaRepository;

    public List<Bolsa> obtenerTodasBolsas() {
        return (List<Bolsa>) bolsaRepository.findAll();
    }

    public Optional<Bolsa> obtenerBolsaPorId(Long id) {
        return bolsaRepository.findById(id);
    }

    public List<Bolsa> obtenerBolsasPorUsuario(Usuario usuario) {
        return bolsaRepository.findAllByUsuario(usuario);
    }

    public Bolsa crearBolsa(Bolsa bolsa) {
        return bolsaRepository.save(bolsa);
    }

    public Optional<Bolsa> actualizarBolsa(Long id, Bolsa bolsa) {
        if (bolsaRepository.existsById(id)) {
            bolsa.setId(id);
            return Optional.of(bolsaRepository.save(bolsa));
        }
        return Optional.empty(); // Manejar la lógica de error
    }

    public void eliminarBolsa(Long id) {
        bolsaRepository.deleteById(id);
    }
}
