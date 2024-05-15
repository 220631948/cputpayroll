package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SalesPerson;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonFactoryTest {

    @Test
    void buildSalesPerson() {
        SalesPerson salesPerson = SalesPersonFactory.buildSalesPerson("0001","Aderito","Zacarias",
                11000, 10.00);

        assertNotNull(salesPerson);
        System.out.println(salesPerson);
    }
}