package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

    @Test
    void testBuildManager() {
        Manager manager = ManagerFactory.buildManager("1001", "Riguen", "Celestino", 2500,"Admin Parking");
        assertNotNull(manager);
        System.out.println(manager);
    }
}