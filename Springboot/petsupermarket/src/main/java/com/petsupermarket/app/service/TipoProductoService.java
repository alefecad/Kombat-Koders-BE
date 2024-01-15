package com.petsupermarket.app.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;

@Service
public class TipoProductoService {
	TipoProductoRepository tipoProductoRepository;
	
	@Autowired
    public TipoProductoService(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }
	
	// Método para obtener todos los tipos de productos
    public Iterable<TipoProducto> getAllTiposProductos() {
        return tipoProductoRepository.findAll();
    }
}
=======
import java.util.List;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoService {
	
	TipoProducto getTipoProductoById(Long id);
	TipoProducto getTipoProductoByTipoProducto(String tipoProducto);
	static List<TipoProducto> getAllTipoProductos() {
		return null;
	}
	TipoProducto getUserByTipoProducto(Long id);
}
 
>>>>>>> TipoProducto
