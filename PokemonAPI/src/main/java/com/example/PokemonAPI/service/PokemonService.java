package com.example.PokemonAPI.service;

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

    public List<Pokemon> obtenerTodos(){
        return this.pokemonRepository.findAll();
    }

    public Pokemon obtenerPorId(Long id){
        return this.pokemonRepository.findById(id).orElse(null);
    }

    public Pokemon crear(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

}
