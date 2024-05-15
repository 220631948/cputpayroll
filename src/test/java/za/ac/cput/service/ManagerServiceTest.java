package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Manager;
import za.ac.cput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ManagerServiceTest {
    @Autowired
    private ManagerService service;

    private final Manager manager = ManagerFactory.buildManager("1002", "Dan", "Land", 4000.00,"Intern");

    @Test
    @Order(1)
    void create() {
        Manager created = service.create(manager);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        assert manager != null;
        Manager read = service.read(manager.getEmployeeNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        assert manager != null;
        Manager newManager = new Manager.Builder().copy(manager)
                .setParkingBay("Engineer ")
                .build();
        Manager updated = service.update(newManager);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    @Order(5)
    void delete() {
        assert manager != null;
        service.delete(manager.getEmployeeNumber());
        System.out.println("Success: salesperson deleted X");
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(service.getAll());
    }
}