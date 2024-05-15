package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeId;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    EmployeeService (EmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee read(EmployeeId id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Set<Employee> getAll() {
        return repository.findAll().stream().collect(Collectors.toSet());
    }
}
