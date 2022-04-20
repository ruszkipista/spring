package game.pokemon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TrainerRepository extends CrudRepository<Trainer, Integer>{
    
}