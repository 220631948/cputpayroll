package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Racer;
import za.ac.cput.factory.RacerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RacerServiceTest {

    @Autowired
    private RacerService service;

    private final Racer racer = RacerFactory.buildRacer("Jamie","Larson", 20);


    @Test
    @Order(1)
    void create() {
        Racer created = service.create(racer);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        assert racer != null;
        Racer read = service.read(racer.getName());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        assert racer != null;
        Racer newRacer = new Racer.Builder().copy(racer).setRacerNumber(racer.getRacerNumber() + 1).build();
        Racer updated = service.update(newRacer);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void winsMoreThan (){
        System.out.println("Racer with number wins more than 3: \n" + service.winsMoreThan(3));
    }


}