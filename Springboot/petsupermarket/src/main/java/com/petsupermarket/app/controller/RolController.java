package com.petsupermarket.app.controller;

import com.petsupermarket.app.entity.Rol;
import com.petsupermarket.app.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/roles")
public class RolController {
	
	@Autowired
	RolService rolService;

    
    //public RolController(RolService rolService) {
    //    this.rolService = rolService;
    //}

    @GetMapping("{rolId}")
    public Rol obtenerRolPorId(@PathVariable ("rolId") Long rolId) {
        return rolService.obtenerRolPorId(rolId);
    }

    @PostMapping
    public Rol crearRol(@RequestBody Rol rol) {
        return rolService.crearRol(rol);
    }

    @PutMapping("{rolId}")
    public Rol actualizarRol(@PathVariable Long rolId, @RequestBody Rol rol) {
        return rolService.actualizarRol(rolId, rol);
    }

    @DeleteMapping("{rolId}")
    public void eliminarRol(@PathVariable Long rolId) {
        rolService.eliminarRol(rolId);
    }

}