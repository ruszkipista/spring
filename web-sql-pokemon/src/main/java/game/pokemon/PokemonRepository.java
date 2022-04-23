package game.pokemon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{
    // this method generates a query of pokemons by name
    // nothing else is needed, only the correct method name
    Iterable<Pokemon> findByName(String name);
    
}
