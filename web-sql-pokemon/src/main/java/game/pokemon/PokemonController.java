package game.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/all")
    public Iterable<Pokemon> getAll(){
        return pokemonRepository.findAll();
    }
}
