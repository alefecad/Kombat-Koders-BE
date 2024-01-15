package com.petsupermarket.app.controller;

import java.util.List;

import com.petsupermarket.app.entity.Usuario;

public class UsuarioController {
	@Autowired
	UsuarioDtoService usuarioDtoService;
	
	@GetMapping
	ResponseEntity< List<UsuarioDto> > getAllUsers(){
		List<UsuarioDto> usuarioDto = usuarioDtoService.getAllUsers();
		return new ResponseEntity<>(usuarioDto, HttpStatus.OK );
	}
	
	@GetMapping("{id}")
	ResponseEntity<UsuarioDto> getUsuarioById(@PathVariable("id") Long id) {
		UsuarioDto usuarioDto = usuarioDtoService.getUsuarioById(id);
		return new ResponseEntity<>(usuarioDto, HttpStatus.OK );
	}
	
	@PostMapping
	ResponseEntity<UsuarioDto> setUsuario(@RequestBody Usuario usuario) {	
		UsuarioDto newUsuarioDto = usuarioDtoService.createUsuario(usuario);
		return new ResponseEntity<>(newUsuarioDto, HttpStatus.CREATED );
	}
	
	@GetMapping("query") 
	ResponseEntity<UsuarioDto> getUserByEmail(@RequestParam(name="email") String email) {
		UsuarioDto usuarioDto = usuarioDtoService.getUserByEmail(email);
		return new ResponseEntity<>(usuarioDto, HttpStatus.OK );
	}
	
	@PutMapping("{id}")
	ResponseEntity<UsuarioDto> updateUsuario(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
		UsuarioDto usuarioDto = usuarioDtoService.updateUsuario(usuario, id);
		return new ResponseEntity<>(usuarioDto, HttpStatus.OK );
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUsuario(@PathVariable("id") Long id ) {
		usuarioDtoService.deleteUsuario(id);
		return new ResponseEntity<>("Usuario id " + id + " successfully deleted", HttpStatus.OK );
		
	}
}


