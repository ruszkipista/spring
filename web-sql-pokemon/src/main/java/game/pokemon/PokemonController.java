package game.pokemon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    private PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository){
        this.pokemonRepository = pokemonRepository;
    }
    
    @GetMapping("/all")
    public Iterable<Pokemon> getAll(){
        return pokemonRepository.findAll();
    }
}
