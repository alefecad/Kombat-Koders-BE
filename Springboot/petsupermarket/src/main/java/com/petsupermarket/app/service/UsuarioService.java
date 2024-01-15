package com.petsupermarket.app.service;

import java.util.List;
import com.petsupermarket.app.entity.Usuario;


public interface UsuarioService {
	Usuario getUsuarioById(Long id);
	Usuario getUsuarioByEmail(String email);
	Usuario createUsuario(Usuario Usuario);
	List<Usuario> getAllUsuario();
	Usuario updateUsuario(Usuario Usuario, Long id);
	void deleteUsuario(Long id);
}
