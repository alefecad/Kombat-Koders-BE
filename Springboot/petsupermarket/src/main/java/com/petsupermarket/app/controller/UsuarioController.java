package com.petsupermarket.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.petsupermarket.app.entity.Usuario;
import com.petsupermarket.app.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	ResponseEntity< List<Usuario> > getAllUsers(){
		List<Usuario> usuarios = usuarioService.getAllUsuarios();
		return new ResponseEntity<>(usuarios, HttpStatus.OK );
	}
	
	@GetMapping("{id}")
	ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") Long id) {
		Usuario usuario = usuarioService.getUsuarioById(id);
		return new ResponseEntity<>(usuario, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<Usuario> setUsuario(@RequestBody Usuario usuario) {	
		Usuario newUsuario = usuarioService.createUsuario(usuario);
		return new ResponseEntity<>(newUsuario, HttpStatus.CREATED );
	}
	
	@PostMapping("query") 
	ResponseEntity<Usuario> getUserByEmail(@RequestParam(name="email") String email, @RequestBody Usuario loginUsuario)  {
		Usuario usuario = usuarioService.getUsuarioByEmail(email);
		usuario.getContraseña();
		loginUsuario.getContraseña();
		if (usuario.getContraseña().equals(loginUsuario.getContraseña() )){	
			return new ResponseEntity<>(usuario, HttpStatus.OK );
		} else {
			throw new IllegalStateException("La contraseña no es la correcta, verifica tu contraseña");
		}
		
	}
	
	@PutMapping("{id}")
	ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
		Usuario newUsuario = usuarioService.updateUsuario(usuario, id);
		return new ResponseEntity<>(newUsuario, HttpStatus.OK );
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUsuario(@PathVariable("id") Long id ) {
		usuarioService.deleteUsuario(id);
		return new ResponseEntity<>("Usuario id " + id + " successfully deleted", HttpStatus.OK );
		
	}
}


