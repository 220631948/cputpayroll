package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeId;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;
    private static Employee employee1;
    private static Employee employee2;

    @Test
    void a_setup(){
        employee1 = EmployeeFactory.buildEmployee("Snoop ", "Dog");
        assertNotNull(employee1);
        System.out.println(employee1);
        employee2 = EmployeeFactory.buildEmployee("Lil ", "wayne");
        assertNotNull(employee2);
        System.out.println(employee2);
    }

    @Test
    void create() {
        Employee created1 = employeeService.create(employee1);
        assertNotNull(created1);
        System.out.println(created1);
        Employee created2 = employeeService.create(employee1);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Test
    void read() {
        EmployeeId id = new EmployeeId(employee2.getFirstName(), employee2.getLastName());
        Employee read = employeeService.read(id);
        //assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Employee newEmployee = new Employee.Builder().copy(employee2).setFirstName("Radford")
                .build();
        Employee updated = employeeService.update(newEmployee);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(employeeService.getAll());
    }
}