package game.pokemon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{
    
}
