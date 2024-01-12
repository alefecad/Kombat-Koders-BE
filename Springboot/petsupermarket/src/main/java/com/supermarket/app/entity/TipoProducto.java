package com.supermarket.app.entity;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "tipo_producto")
	public class TipoProducto {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "tipoProducto", nullable = false, length = 45)
	    private String tipoProducto;

	   @ManyToOne
	   @JoinColumn(name = "categorias_id", nullable = false)
	    private Categorias categorias;
}

