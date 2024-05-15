package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.util.Helper;

import java.util.logging.Handler;

public class BookFactory {
    public static Book buildBook(long productId, String name, String author){
        if (productId <= 0)
            return null;
        if (Helper.isNullorEmpty(name) ||
            Helper.isNullorEmpty(author))
            return null;

        return new Book(productId, name, author);
    }
}
