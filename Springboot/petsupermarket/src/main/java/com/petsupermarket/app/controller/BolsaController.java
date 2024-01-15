package com.petsupermarket.app.controller;

import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.Usuario;
import com.petsupermarket.app.service.BolsaService;
import com.petsupermarket.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bolsas")
public class BolsaController {

    @Autowired
    private BolsaService bolsaService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Bolsa> obtenerTodasBolsas() {
        return bolsaService.obtenerTodasBolsas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bolsa> obtenerBolsaPorId(@PathVariable Long id) {
        Optional<Bolsa> bolsa = bolsaService.obtenerBolsaPorId(id);
        return bolsa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Bolsa> obtenerBolsasPorUsuario(@PathVariable Long usuarioId) {
        Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        return usuario.map(bolsaService::obtenerBolsasPorUsuario).orElse(null);
    }

    @PostMapping
    public ResponseEntity<Bolsa> crearBolsa(@RequestBody Bolsa bolsa) {
        Bolsa nuevaBolsa = bolsaService.crearBolsa(bolsa);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaBolsa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bolsa> actualizarBolsa(@PathVariable Long id, @RequestBody Bolsa bolsa) {
        Optional<Bolsa> bolsaActualizada = bolsaService.actualizarBolsa(id, bolsa);
        return bolsaActualizada.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBolsa(@PathVariable Long id) {
        bolsaService.eliminarBolsa(id);
        return ResponseEntity.noContent().build();
    }
}
