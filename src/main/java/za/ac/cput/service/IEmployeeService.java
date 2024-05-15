package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeId;

import java.util.List;
import java.util.Set;

public interface IEmployeeService extends IService<Employee, EmployeeId>{
    Set<Employee> getAll();
}
