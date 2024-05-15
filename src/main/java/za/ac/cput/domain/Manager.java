package za.ac.cput.domain;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Manager extends BaseEmployee{
    private String parkingBay;

    protected Manager() {}

    private Manager (Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.salary = builder.salary;
        this.parkingBay = builder.parkingBay;
    }

    public String getParkingBay() {
        return parkingBay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(parkingBay, manager.parkingBay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parkingBay);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "parkingBay='" + parkingBay + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {
        private String employeeNumber;
        private String firstName;
        private String lastName;
        private double salary;
        private String parkingBay;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setParkingBay(String parkingBay) {
            this.parkingBay = parkingBay;
            return this;
        }

        public Builder copy (Manager manager) {
            this.employeeNumber = manager.employeeNumber;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.salary = manager.salary;
            this.parkingBay = manager.parkingBay;
            return this;
        }

        public Manager build(){
            return new Manager(this);
        }

    }

}
