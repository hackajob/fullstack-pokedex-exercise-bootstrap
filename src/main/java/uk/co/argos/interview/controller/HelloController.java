package uk.co.argos.interview.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import uk.co.argos.interview.service.PokedexService;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @GetMapping("/h/p/n/{name}")
    public boolean check(@PathVariable String name) {
        PokedexService validator = new PokedexService();

        return validator.get(name);
    }
}
