package za.ac.cput.factory;

import za.ac.cput.domain.Manager;
import za.ac.cput.util.Helper;

public class ManagerFactory {
    public static Manager buildManager (String employeeNumber, String firstName, String lastName, double salary, String parkingBay){
    if (Helper.isNullorEmpty(employeeNumber) ||
        Helper.isNullorEmpty(firstName) ||
        Helper.isNullorEmpty(lastName) ||
        Helper.isNullorEmpty(parkingBay) ||
        salary <= 0)
        return null;

    return new Manager.Builder().setEmployeeNumber(employeeNumber)
            .setFirstName(firstName)
            .setLastName(lastName)
            .setSalary(salary)
            .setParkingBay(parkingBay)
            .build();

    }

}
