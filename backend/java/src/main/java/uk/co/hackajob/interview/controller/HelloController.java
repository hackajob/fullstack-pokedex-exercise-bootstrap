package uk.co.hackajob.interview.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uk.co.hackajob.interview.service.PokedexService;
import uk.co.hackajob.interview.entity.Pokemon;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/h/p/n/{name}")
    public Pokemon check(@PathVariable String name) {
        PokedexService pokedexService = new PokedexService();

        return pokedexService.get(name);
    }
}
