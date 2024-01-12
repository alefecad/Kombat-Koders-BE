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
@Table(name="producto")
public class Producto {


		@Id // Indica que el atributo será la clave primaria de la entidad
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column(name="nombre", nullable=false, length=45)
		private String nombre;
		@Column(name="descripcion", nullable=false, length=200)
		private String descripcion;
		@Column(name="contenido", nullable=false, length=45)
		private String contenido;
		@Column(name="precio", nullable=false)
		private float precio;
		@Column(name="descuento", nullable=false)
		private int descuento;
		@Column(name="existencia", nullable=false)
		private int existencia;
		@Column(name="imagen", nullable=false, length=500)
		private String imagen;
		@Column(name="marca", nullable=false, length=45)
		private String marca;
		
		@ManyToOne
		@JoinColumn(name="Tipo_Producto_id", nullable=false)
		private Producto producto;
		
		@ManyToOne
		@JoinColumn(name="Tipo_Producto_Categoria_id", nullable=false)
		private Categorias categoria;
}
