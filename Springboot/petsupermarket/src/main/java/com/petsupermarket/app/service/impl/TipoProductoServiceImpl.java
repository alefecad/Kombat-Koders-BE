package com.petsupermarket.app.service.impl;

import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.repository.TipoProductoRepository;
import com.petsupermarket.app.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TipoProductoServiceImpl implements TipoProductoService{
	TipoProductoRepository tipoProductoRepository;
	
	@Autowired
	public TipoProductoServiceImpl(TipoProductoRepository tipoProductoRepository) {
		this.tipoProductoRepository = tipoProductoRepository;
	}
	
	@Override
	public Iterable<TipoProducto> getAllTipoProducto(){
		return tipoProductoRepository.findAll();
	}
	
	public Optional<TipoProducto> getTipoProductoById(Long id){
		return tipoProductoRepository.findById(id);
	}
	
	public TipoProducto tipoProducto(TipoProducto tipoProducto) {
		return tipoProductoRepository.save(tipoProducto);
	}
	
	public TipoProducto updateTipoProducto(Long id, TipoProducto tipoProducto) {
		tipoProducto.setId(id);
		return tipoProductoRepository.save(tipoProducto);
	}
	
	public void deleteTipoProducto(Long id) {
		tipoProductoRepository.deleteById(id);
	}
	
}