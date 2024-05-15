package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
    public static Employee buildEmployee (String employeeNumber, String firstName, String lastName) {
        if (Helper.isNullorEmpty(employeeNumber) ||
            Helper.isNullorEmpty(firstName) ||
            Helper.isNullorEmpty(lastName)){
        return null;
    }
        return new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
    public static Employee buildEmployee(String firstName,
                                         String lastName){

        if (Helper.isNullorEmpty(firstName) ||
            Helper.isNullorEmpty(lastName)) {
            return null;
        }

        String employeeNumber = Helper.generateId();

        return new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();

    }

}
