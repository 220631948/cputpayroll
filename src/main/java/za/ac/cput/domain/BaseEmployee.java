package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Objects;

@MappedSuperclass
public class BaseEmployee {
    @Id
    protected String employeeNumber;
    protected String firstName;
    protected String lastName;
    protected double salary;

    protected BaseEmployee(){}

    public BaseEmployee(String employeeNumber, String firstName, String lastName, double salary) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEmployee that = (BaseEmployee) o;
        return Double.compare(salary, that.salary) == 0 && Objects.equals(employeeNumber, that.employeeNumber) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, firstName, lastName, salary);
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }



}
