package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Book;
import za.ac.cput.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository repository;

    @Autowired
    BookService (BookRepository repository){
        this.repository = repository;
    }

    public Book create (Book book){return repository.save(book);}
}
