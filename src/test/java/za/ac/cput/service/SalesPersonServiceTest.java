package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.SalesPerson;
import za.ac.cput.factory.SalesPersonFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SalesPersonServiceTest {

    @Autowired
    private SalesPersonService service;

    private SalesPerson salesPerson= SalesPersonFactory.buildSalesPerson("0001", "Jairo", "Colmer",8000.00,10.00);

    @Test
    @Order(1)
    void create() {
        SalesPerson created = service.create(salesPerson);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        SalesPerson read = service.read(salesPerson.getEmployeeNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        SalesPerson newSalesPerson = new SalesPerson.Builder().copy(salesPerson)
                .setCommission(12.00f)
                .build();
        SalesPerson updated = service.update(newSalesPerson);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    @Order(5)
    void delete() {
        service.delete(salesPerson.getEmployeeNumber());
        System.out.println("Success: salesperson");
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(service.getAll());
    }
}