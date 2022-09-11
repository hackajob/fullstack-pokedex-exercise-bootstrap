package uk.co.hackajob.interview.service;

import uk.co.hackajob.interview.entity.Pokemon;

public class PokedexService {

    /**
     * There is a JSON file pokedex.json with all the pokemons available. This service will accept the pokemon name in
     * english as parameter, and it will return all the details about the pokemon received.
     */
    public Pokemon get(String name) {
        return new Pokemon();
    }

}
