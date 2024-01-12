package edu.unir.co.demo.poke.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unir.co.demo.poke.entity.Pokemon;
import edu.unir.co.demo.poke.repository.PokemonRepository;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemons(){
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> getPokemon(Long id){
        return pokemonRepository.findById(id);
    }

    public void updatePokemon(Pokemon nombre){
        pokemonRepository.save(nombre);
    }

    public void deletePokemon(Long id){
        pokemonRepository.deleteById(id);
    }
    
}
