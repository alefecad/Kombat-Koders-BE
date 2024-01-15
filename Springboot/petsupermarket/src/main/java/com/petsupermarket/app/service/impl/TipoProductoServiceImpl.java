package com.petsupermarket.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;
import com.petsupermarket.app.service.TipoProductoService;


@Service
public abstract class TipoProductoServiceImpl implements TipoProductoService {
	
	@Autowired
	TipoProductoRepository tipoProductoRepository;	
	
	@Override
	public TipoProducto getUserByTipoProducto(Long id) {
		Optional<TipoProducto> tipoProductoOptional = tipoProductoRepository.findById(id);
		
		if( tipoProductoOptional.isPresent()) return tipoProductoOptional.get();
		else throw new IllegalStateException("Tipo Producto does not exist " + toString());
	}
}
 