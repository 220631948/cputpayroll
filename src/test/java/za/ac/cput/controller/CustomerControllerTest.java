package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
        String url = BASE_URL + "/read" + customer.getCustomerId();
        System.out.println("URL: "+ url);
        ResponseEntity<Customer> response = restTemplate.getForEntity(url, Customer.class);
        assertEquals(customer.getCustomerId(), response.getBody().getCustomerId());
        System.out.println("Read: " + response.getBody());
    }

    @Test
    void update() {
        String url = BASE_URL + "/update";
        Customer newCustomer = new Customer.Builder().copy(customer)
                .setFirstName("Brian").build();
        ResponseEntity <Customer> postResponse = restTemplate.postForEntity(url, newCustomer, Customer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        //assertEquals(postResponse.getStatusCode().HttpStatus.OK);
        Customer customerUpdated = postResponse.getBody();
        assertEquals(newCustomer.getCustomerId(), customerUpdated.getCustomerId());
        System.out.println("Updated data: " + customerUpdated);
    }

//    @Test
//    void delete (){
//        String url = BASE_URL + "/delete/" + customer.getCustomerId();
//        System.out.println("URL: "+url);
//        restTemplate.delete(url);
//        System.out.println("Success: Deleted customer");
//    }

    @Test
    void getAll() {
        String url = BASE_URL + "getAll";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity <String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity <String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show All: ");
        System.out.println(response);
        System.out.println(response.getBody());

    }
}