package za.ac.cput.domain;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    @Id
    private long personId;
    private String name;


}
