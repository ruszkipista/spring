package game.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/all")
    public Iterable<Pokemon> getAll(){
        return pokemonRepository.findAll();
    }

    @GetMapping("/{pokemonname}")
    public Iterable<Pokemon> getPokemonByName(@PathVariable String pokemonname){
        return pokemonRepository.findByName(pokemonname);
    }
}
