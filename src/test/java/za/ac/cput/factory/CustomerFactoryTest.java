package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void testBuildCustomer() {
        Contact contact = ContactFactory.buildContact("jack.alonso90@gmail.com", "0623108129", "jack.alonso90@linkedIn.com");
        assertNotNull(contact);
        Customer customer = CustomerFactory.buildCustomer("0001", "Jack","Alonso",contact);
        assertNotNull(customer);
        System.out.println(customer);
    }

    @Test
    void testAnotherBuildCustomer (){
        Customer customer = CustomerFactory.buildCustomer("0002", "Jacob", "Panico", "jacodopanico@gmail.com", "061319128","jacodopanico@linkedIn.com");
        assertNotNull(customer);
        System.out.println(customer);
    }

    @Test
    void testCustomerThatFails(){
        Contact contact = ContactFactory.buildContact("jack.alonso90", "0623108129", "jack.alonso90@linkedIn.com");
        assertNotNull(contact);
        Customer customer = CustomerFactory.buildCustomer("0001", "Jack","Alonso",contact);
        assertNotNull(customer);
        System.out.println(customer);
    }
}