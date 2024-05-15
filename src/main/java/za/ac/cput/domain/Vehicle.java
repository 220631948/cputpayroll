package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
    @Id
    private long vehicle;
    private String manufacturer;

    protected Vehicle() {}

    private Vehicle(Builder builder) {
        this.vehicle = builder.vehicle;
        this.manufacturer = builder.manufacturer;
    }

    public long getVehicle() {
        return vehicle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle1 = (Vehicle) o;
        return vehicle == vehicle1.vehicle && Objects.equals(manufacturer, vehicle1.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, manufacturer);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle=" + vehicle +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public static class Builder{
        private long vehicle;
        private String manufacturer;

        public Builder setVehicle(long vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder copy (Vehicle vehicle) {
            this.vehicle = vehicle.vehicle;
            this.manufacturer = vehicle.manufacturer;
            return this;
        }

        public Vehicle build(){return new Vehicle(this);}
    }

}

