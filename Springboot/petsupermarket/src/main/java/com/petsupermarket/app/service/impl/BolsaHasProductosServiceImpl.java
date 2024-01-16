package com.petsupermarket.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petsupermarket.app.entity.BolsaHasProductos;
import com.petsupermarket.app.repository.BolsaHasProductosRepository;
import com.petsupermarket.app.service.BolsaHasProductosService;

@Service
public class BolsaHasProductosServiceImpl implements BolsaHasProductosService {

    @Autowired
    BolsaHasProductosRepository bolsaHasProductosRepository;

	@Override
	public BolsaHasProductos getBolsaHasProductosById(Long id) {
		Optional<BolsaHasProductos> existingBolsaHasProductos = bolsaHasProductosRepository.findById(id);
		if( existingBolsaHasProductos.isPresent()) return existingBolsaHasProductos.get();
		else throw new IllegalStateException("BolsaHasProductos does not exist" + id);		
	}
	
	
	@Override
	public List<BolsaHasProductos> getAllBolsaHasProductos(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBolsaHasProductos(BolsaHasProductos bolsaHasProductos) {
	bolsaHasProductosRepository.save(bolsaHasProductos);
		
	}

	@Override
	public void deleteBolsaHasProductos(Long id) {
		bolsaHasProductosRepository.deleteById(id);
		
	}

}