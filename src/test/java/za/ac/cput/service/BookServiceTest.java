package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Pen;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
class BookServiceTest {
    @Autowired
    public BookService service;

    @Autowired
    public PenService penService;

    public Book book = new Book(1001,"Drums Stick","Ethan Gray");

    public Pen pen =new Pen(1233434,"Stain","Blue");

    @Test
    void create() {
        Book created = service.create(book);
        assertNotNull(created);
        System.out.println(book);
    }

    @Test
    public void
    givenSubclasses_whenQuerySingleTableSuperclas_thenOk(){
        Book book = new Book(1,"Baeldung","George Orwell");
        service.create(book);
        Pen pen = new Pen( 2,"Standard","Black");
        penService.create(pen);

        //Ask Mister Naidoo
//        assertThat(service.create()
//                .getClass()).size().isEqualTo(2);
//
    }


}