package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeId;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, EmployeeId> {

    Employee findEmployeeByFirstName (String firstName);
    void deleteEmployeesByFirstName (String firstName);
    void deleteEmployeesByLastName (String lastName);
}
