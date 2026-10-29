package com.example.PokemonAPI.service;

import com.example.PokemonAPI.exception.RecursoNotFoundException;
import com.example.PokemonAPI.model.Pokemon;
import com.example.PokemonAPI.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> obtenerTodos() {
        return this.pokemonRepository.findAll();
    }

    public Pokemon obtenerPorId(Long id) {
        return this.pokemonRepository.findById(id).orElseThrow(
                () -> new RecursoNotFoundException("No existe un pokemon con el id " + id)
        );
    }

    public Pokemon crear(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    // PUT: reemplaza todos los valores del recurso
    public Pokemon actualizarPokemonCompleto(Long id, Pokemon pokemonActualizado) {
        return pokemonRepository.findById(id).map(pokemon -> {
            pokemon.setNombre(pokemonActualizado.getNombre());
            pokemon.setTipo(pokemonActualizado.getTipo());
            pokemon.setNivel(pokemonActualizado.getNivel());
            pokemon.setAtaque(pokemonActualizado.getAtaque());
            pokemon.setDefensa(pokemonActualizado.getDefensa());
            pokemon.setDescripcion(pokemonActualizado.getDescripcion());
            pokemon.setImagenUrl(pokemonActualizado.getImagenUrl());
            pokemon.setCorreoEntrenador(pokemonActualizado.getCorreoEntrenador());
            pokemon.setFechaCaptura(pokemonActualizado.getFechaCaptura());
            return pokemonRepository.save(pokemon);
        }).orElse(null);
    }

    // PATCH: solo actualiza los campos que vienen en la peticion
    public Pokemon actualizarPokemonParcial(Long id, Pokemon pokemonParcial) {
        return pokemonRepository.findById(id).map(pokemon -> {
            if (pokemonParcial.getNombre() != null) pokemon.setNombre(pokemonParcial.getNombre());
            if (pokemonParcial.getTipo() != null) pokemon.setTipo(pokemonParcial.getTipo());
            if (pokemonParcial.getNivel() != null) pokemon.setNivel(pokemonParcial.getNivel());
            if (pokemonParcial.getAtaque() != null) pokemon.setAtaque(pokemonParcial.getAtaque());
            if (pokemonParcial.getDefensa() != null) pokemon.setDefensa(pokemonParcial.getDefensa());
            if (pokemonParcial.getDescripcion() != null) pokemon.setDescripcion(pokemonParcial.getDescripcion());
            if (pokemonParcial.getImagenUrl() != null) pokemon.setImagenUrl(pokemonParcial.getImagenUrl());
            if (pokemonParcial.getCorreoEntrenador() != null)
                pokemon.setCorreoEntrenador(pokemonParcial.getCorreoEntrenador());
            if (pokemonParcial.getFechaCaptura() != null) pokemon.setFechaCaptura(pokemonParcial.getFechaCaptura());
            return pokemonRepository.save(pokemon);
        }).orElse(null);
    }

    public void eliminarPokemon(Long id) {
        pokemonRepository.deleteById(id);
    }


}
