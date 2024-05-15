package za.ac.cput.domain;

import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeId implements Serializable {
    @Id
    private String firstName;
    @Id
    private String lastName;

    public EmployeeId() {
    }

    public EmployeeId(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeId that = (EmployeeId) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
