package com.petsupermarket.app.controller;

<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

>>>>>>> equipo2_tarea13
import com.petsupermarket.app.entity.TipoProducto;
import com.petsupermarket.app.service.TipoProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
<<<<<<< HEAD
@RequestMapping("/tipoProductos")

public class TipoProductoController{
	
	@Autowired
	TipoProductoService tipoProductoService;
	
	 @GetMapping("{id}")
	    public TipoProducto getTipoProductoById(@PathVariable Long id) {
	        return tipoProductoService.getTipoProductoById(id);
	    }
	
	 @GetMapping
	 public List<TipoProducto> getAllTipoProductos() {
	     List<TipoProducto> tipoProductos = tipoProductoService.getAllTipoProductos();
	     return tipoProductos;
	 }
	
	@GetMapping("tipoProducto")
    public TipoProducto getTipoProductoByTipo(@RequestParam String tipoProducto) {
        return tipoProductoService.getTipoProductoByTipoProducto(tipoProducto);
    }	
	
}
=======
@RequestMapping("api/v1/tipoProducto")
public class TipoProductoController {

    private final TipoProductoRepository tipoProductoRepository;

    @Autowired
    public TipoProductoController(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    // Endpoint para obtener todos los tipos de productos
    @GetMapping
    public Iterable<TipoProducto> getTiposProductos() {
        return tipoProductoRepository.findAll();
    }

    // Endpoint para obtener un tipo de producto por su ID
    @GetMapping("/{id}")
    public TipoProducto getTipoProductoById(@PathVariable Long id) {
        return tipoProductoRepository.findById(id).orElse(null);
    }

    // Endpoint para crear un nuevo tipo de producto
    @PostMapping
    public TipoProducto createTipoProducto(@RequestBody TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    // Endpoint para actualizar un tipo de producto existente
    @PutMapping("/{id}")
    public TipoProducto updateTipoProducto(@PathVariable Long id, @RequestBody TipoProducto tipoProducto) {
        tipoProducto.setId(id);
        return tipoProductoRepository.save(tipoProducto);
    }

    // Endpoint para eliminar un tipo de producto por su ID
    @DeleteMapping("/{id}")
    public void deleteTipoProducto(@PathVariable Long id) {
        tipoProductoRepository.deleteById(id);
    }
}
>>>>>>> equipo2_tarea13
