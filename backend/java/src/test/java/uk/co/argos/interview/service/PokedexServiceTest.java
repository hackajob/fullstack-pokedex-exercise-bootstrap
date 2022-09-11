package uk.co.hackajob.interview.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PokedexServiceTest {

    private static final String FIRST_POKEMON = "Bulbasaur";

    private static final String SECOND_POKEMON = "Wartortle";

    private static PokedexService pokedexService;

    @BeforeAll
    static void beforeAll() {
        pokedexService = new PokedexService();
    }

    // TODO: Unit test me :)

}
