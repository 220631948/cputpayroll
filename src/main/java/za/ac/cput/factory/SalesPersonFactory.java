package za.ac.cput.factory;

import za.ac.cput.domain.SalesPerson;
import za.ac.cput.util.Helper;

public class SalesPersonFactory {
    public static SalesPerson buildSalesPerson(String employeeNumber, String firstName, String lastName,double salary, double commission){
        if (Helper.isNullorEmpty(employeeNumber) ||
            Helper.isNullorEmpty(firstName) ||
            Helper.isNullorEmpty(lastName))
            return null;
        if (salary < 0 || commission < 0)
            return null;

        return new SalesPerson.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setSalary(salary)
                .setCommission(commission)
                .build();
    }
}
