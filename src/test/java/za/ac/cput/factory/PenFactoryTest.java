package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Pen;

import static org.junit.jupiter.api.Assertions.*;

class PenFactoryTest {

    @Test
    void testBuildPen() {
        Pen pen = new Pen(123,"Bic","Black");
        assertNotNull(pen);
        System.out.println(pen);
    }
}