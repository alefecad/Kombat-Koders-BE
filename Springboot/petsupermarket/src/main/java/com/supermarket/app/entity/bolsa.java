package com.supermarket.app.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "bolsa")
public class bolsa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_compra", nullable = false)
    private Timestamp fechaCompra;

    @ManyToOne
    @JoinColumn(name = "Usuario_id", nullable = false)
    private usuario usuario;

    // Getters y setters
}