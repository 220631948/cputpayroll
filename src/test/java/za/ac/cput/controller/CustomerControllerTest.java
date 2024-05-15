package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private final String BASE_URL = "http://localhost:8080/payroll/customer";

    private static Customer customer;

    @BeforeEach
    void setUp() {
        customer = CustomerFactory.buildCustomer("12345","Thalita", "Sithembiso", "thalita@gmail.com","12345678","thalitasithembo@linkedIn");
    }

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<Customer > postResponse = restTemplate.postForEntity(url, customer, Customer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        //assertNotEquals(postResponse.getStatusCode().HttpStatus.OK);
        Customer customerSaved = postResponse.getBody();
        assertEquals(customer.getCustomerId(), customerSaved.getCustomerId());
        System.out.println("Saved data: " +customerSaved);
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void getAll() {
    }
}