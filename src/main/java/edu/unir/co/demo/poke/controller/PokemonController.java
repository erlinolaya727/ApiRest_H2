
package edu.unir.co.demo.poke.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unir.co.demo.poke.entity.Pokemon;
import edu.unir.co.demo.poke.service.PokemonService;

@RestController
@RequestMapping(path = "api/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> getAll(){
        return pokemonService.getPokemons();
    }

     @GetMapping("/{id}")
    public Optional <Pokemon> getById(@PathVariable("id") Long id){
        return pokemonService.getPokemon(id);
    }

    @PostMapping
    public void updatePokemon(@RequestBody Pokemon nombre){
        pokemonService.updatePokemon(nombre);
    }
    
    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable("id") Long id){
        pokemonService.deletePokemon(id);
    }
}