package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.SalesPerson;
import za.ac.cput.repository.SalesPersonRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SalesPersonService implements ISalesPersonService{
    private SalesPersonRepository repository;

    @Autowired
    SalesPersonService(SalesPersonRepository repository){
        this.repository = repository;
    }


    @Override
    public SalesPerson create(SalesPerson salesPerson) {
        return repository.save(salesPerson);
    }

    @Override
    public SalesPerson read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SalesPerson update(SalesPerson salesPerson) {
        return repository.save(salesPerson);
    }

    @Override
    public void delete(String employeeNumber) {
        repository.deleteById(employeeNumber);

    }

    @Override
    public Set<SalesPerson> getAll() {
        return repository.findAll().stream().collect(Collectors.toSet());
    }
}
