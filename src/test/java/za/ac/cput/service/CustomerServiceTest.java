package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerServiceTest {
    @Autowired
    private CustomerService service;

    private final Customer customer = CustomerFactory.buildCustomer("0001","Vince", "Calm","vinceCalm@gmail.com", "082334783", "vinceCalm@linkedIn.com");

    @Test
    @Order(1)
    void create() {
        assert customer != null;
        Customer created = service.create(customer);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        assert customer != null;
        Customer read = service.read(customer.getCustomerId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        assert customer != null;
        Contact editedContact = new Contact.Builder().copy(customer.getContact())
                .setMobile("0731239898").build();
        assertNotNull(editedContact);
        Customer editedCustomer = new Customer.Builder().copy(customer)
                .setContact(editedContact).build();
        Customer updated = service.update(editedCustomer);
        assertNotNull(editedCustomer);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(service.getAll());
    }
}