package com.petsupermarket.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.Bolsa;
import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;
import com.petsupermarket.app.service.TipoProductoService;


@Service
public abstract class TipoProductoServiceImpl implements TipoProductoService {
	
	@Autowired
	TipoProductoRepository tipoProductoRepository;	
	
	@Override
	public List<TipoProducto> getAllTipoProductos() {
		return (List<TipoProducto>) tipoProductoRepository.findAll();
	}
	
	@Override
	public TipoProducto crearTipoProducto(TipoProducto tipoProducto) {
		return tipoProductoRepository.save(tipoProducto);		
	}
	@Override
    public Optional<TipoProducto> actualizarTipoProducto(Long id, TipoProducto tipoProducto) {
        if (tipoProductoRepository.existsById(id)) {
            tipoProducto.setId(id);
            return Optional.of(tipoProductoRepository.save(tipoProducto));
        }
        return Optional.empty(); // Manejar la lógica de error
    }

    @Override
    public void eliminarTipoProducto(Long id) {
        tipoProductoRepository.deleteById(id);
    }
	
}
 