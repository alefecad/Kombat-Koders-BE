package com.petsupermarket.app.service.impl;

import com.petsupermarket.app.entity.Rol;
import com.petsupermarket.app.repository.RolRepository;
import com.petsupermarket.app.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolServiceImpl implements RolService{
	
	private final RolRepository rolRepository;

    @Autowired
    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol obtenerRolPorId(Long rolId) {
        Optional<Rol> optionalRol = rolRepository.findById(rolId);
        return optionalRol.orElse(null);
    }

    @Override
    public Rol crearRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol actualizarRol(Long rolId, Rol rol) {
        if (rolRepository.existsById(rolId)) {
            rol.setId(rolId);
            return rolRepository.save(rol);
        }
        return null;
    }

    @Override
    public void eliminarRol(Long rolId) {
        rolRepository.deleteById(rolId);
    }

}
