package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void testBuildEmployee(){
        Employee e = EmployeeFactory.buildEmployee("Drake ","Graham");
        assertNotNull(e);

        System.out.println(e.toString());

    }

    @Test
    void testBuildEmployeeWithFail(){
        Employee e = EmployeeFactory.buildEmployee("","");
        assertNotNull(e);

        System.out.println(e.toString());
    }

}