package za.ac.cput.service;

import za.ac.cput.domain.Manager;

import java.util.Set;

public interface IManagerService extends IService<Manager, String>{
    void delete(String employeeNumber);
    Set<Manager> getAll();
}
