package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Pet;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
class PetServiceTest {
    @Autowired
    private PetService service;

    private final Pet pet = new Pet (1234, "Feline", "Dog");

    @Test
    void create() {
        Pet created = service.create(pet);
        assertNotNull(created);
        System.out.println(created);
    }
}