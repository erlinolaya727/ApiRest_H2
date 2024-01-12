package edu.unir.co.demo.poke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unir.co.demo.poke.entity.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
    
}