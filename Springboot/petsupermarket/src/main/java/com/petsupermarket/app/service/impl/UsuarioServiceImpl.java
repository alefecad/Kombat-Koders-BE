package com.petsupermarket.app.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.Usuario;
import com.petsupermarket.app.repository.UsuarioRepository;
import com.petsupermarket.app.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	
	@Override
	public Usuario getUsuarioById(Long id) {
		Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
		
		if( usuarioOptional.isPresent()) return usuarioOptional.get();
		else throw new IllegalStateException("User does not exist with id " + id);
	}

	@Override
	public Usuario getUsuarioByEmail(String email) {
		Optional<Usuario> existingUsuario = usuarioRepository.findByEmail(email);
		if( existingUsuario.isPresent()) return existingUsuario.get();
		else throw new IllegalStateException("Usuario does not exist with email " + email);
	}


	@Override
	public Usuario updateUsuario(Usuario usuario, Long id) {
		Usuario existingUsuario = getUsuarioById(id);
		existingUsuario.setBirthdate(usuario.getBirthdate());
		existingUsuario.setCiudad(usuario.getCiudad());
		existingUsuario.setContraseña(usuario.getContraseña());
		existingUsuario.setCp(usuario.getCp());
		existingUsuario.setDirecion(usuario.getDirecion());
		existingUsuario.setEmail(usuario.getEmail());
		existingUsuario.setNombre(usuario.getNombre());
		existingUsuario.setRol(usuario.getRol());
		existingUsuario.setTelefono(usuario.getTelefono());
		return usuarioRepository.save(existingUsuario);
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		usuario.setId(null);
		usuario.setActive(true);
		Usuario newUsuario = usuarioRepository.save( usuario );
		return newUsuario;
	}

	@Override
	public List<Usuario> getAllUsuario() {
		List<Usuario> usuario = (List<Usuario>) usuarioRepository.findAll();
		return usuario;
	}

	@Override
	public void deleteUsuario(Long id) {
		Usuario existingUsuario = getUsuarioById(id);
		existingUsuario.setActive(false);
		usuarioRepository.save(existingUsuario);
	}
}
