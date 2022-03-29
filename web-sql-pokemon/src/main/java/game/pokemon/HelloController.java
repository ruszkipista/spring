package game.pokemon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //enable class as a Controller as part of the MVC framework
public class HelloController {
    
    @GetMapping("/") //route the specified HTTP GET request to a message based on the path configured
    public String index() {
        return "Hello Trainers!";
    }
 
}
