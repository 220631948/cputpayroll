package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {

    @Test
    void testBuildBook() {
        Book book = new Book(1003, "Fairy Life","Denise");
        assertNotNull(book);
        System.out.println(book);
    }
}