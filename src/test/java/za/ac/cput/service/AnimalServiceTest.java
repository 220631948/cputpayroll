package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Animal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AnimalServiceTest {
    @Autowired
    private AnimalService service;

    private final Animal animal = new Animal(1212121121,"Reptile");

    @Test
    void create() {
        Animal created = service.create(animal);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Animal read = service.read(animal.getAnimalId());
        assertNotNull(read);
        System.out.println(read);
    }


}