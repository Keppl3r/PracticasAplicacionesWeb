package com.example.GameVault.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Usuario dueño de juegos en la bóveda.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    // Se guarda cifrada con BCrypt, nunca en texto plano.
    @Column(nullable = false)
    private String contrasenia;

    // Un usuario tiene muchos juegos; mappedBy apunta al atributo "usuario" de Juego.
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Juego> juegos;
}
