package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Racer;

import static org.junit.jupiter.api.Assertions.*;

class RacerFactoryTest {

    @Test
    void testBuildRacerWithMiddleName() {
        Racer racer = RacerFactory.buildRacer("Davison", "Gomes","Cayundo",21);
        assertNotNull(racer);
        System.out.println(racer);

    }

    @Test
    void testBuildRacerWithoutMiddleName() {
        Racer racer = RacerFactory.buildRacer("Davison","Cayundo",27);
        assertNotNull(racer);
        System.out.println(racer);
    }

    @Test
    void testBuildRacerThatFails(){
        Racer racer = RacerFactory.buildRacer("","",00);
        assertNotNull(racer);
        System.out.println(racer);
    }
}