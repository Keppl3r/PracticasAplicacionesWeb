package com.example.PokemonAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del pokemon es necesario")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo es necesario")
    @Size(min = 2, max = 100, message = "El tipo debe tener entre 2 y 100 caracteres")
    private String tipo;

    @NotNull(message = "El nivel de pokemon es necesario")
    @Min(value = 1, message = "El nivel minimo es 1")
    @Max(value = 100, message = "El nivel no puede sobrepasar 100")
    private Integer nivel;

    @Min(value = 0, message = "El ataque no puede ser negativo")
    private Integer ataque;

    @Min(value = 0, message = "La defensa no puede ser negativa")
    private Integer defensa;

    @NotBlank(message = "La descripcion es necesaria")
    @Size(max = 255, message = "La descripcion no puede ser mayor a 255 caracteres")
    private String descripcion;

    @URL(message = "El formato debe ser URL")
    private String imagenUrl;

    @Email(message = "El formato del correo no es valido")
    private String correoEntrenador;

    @PastOrPresent(message = "La fecha de captura no puede ser futura")
    private LocalDate fechaCaptura;
}




