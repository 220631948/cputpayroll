package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VehicleServiceTest {
    @Autowired
    private VehicleService service;

    private final Vehicle vehicle = VehicleFactory.buildVehicle(987654567, "Mercedes");


    @Test
    void create() {
        Vehicle created = service.create(vehicle);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Vehicle read = service.read(vehicle.getVehicle());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Vehicle newVehicle = new Vehicle.Builder().copy(vehicle).setVehicle(123456789)
                .build();
        Vehicle updated = service.update(newVehicle);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(service.getAll());
    }
}