package com.petsupermarket.app.service;

import com.petsupermarket.app.entity.Rol;

public interface RolService {
	
	public Rol obtenerRolPorId(Long rolId);

    Rol crearRol(Rol rol);

    Rol actualizarRol(Long rolId, Rol rol);

    void eliminarRol(Long rolId);
	
}