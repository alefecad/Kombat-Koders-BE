package com.supermarket.app.entity;

import java.sql.Timestamp;
import lombok.*;
import jakarta.persistence.*;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="usuario")
public class Usuario {

	

		@Id // Indica que el atributo será la clave primaria de la entidad
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column(name="nombre", nullable=false, length=70)
		private String nombre;
		@Column(name="direccion", nullable=false, length=300)
		private String direcion;
		@Column(name="telefono", nullable=false, length=30)
		private String telefono;
		@Column(name="email", nullable=false, length=120, unique=true)
		private String email;
		@Column(name="fechaNacimiento")
		private Timestamp birthdate;
		@Column(name="ciudad", nullable=false, length=45)
		private String ciudad;
		@Column(name="cp", nullable=false, length=10)
		private String cp;
		
		@ManyToOne
		@JoinColumn(name="Rol_id", nullable=false)
		private Rol rol;
}
