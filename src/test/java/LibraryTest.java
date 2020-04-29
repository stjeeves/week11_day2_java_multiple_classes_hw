import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("The Magician", "Raymond E. Feist", "Fantasy");
        book = new Book("The Bible", "God", "Fantasy");
        book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        book = new Book("Harry Potter And The Prisoner Of Azkaban", "J. K. Rowling","Fantasy");
    }

    @Test
    public void checkCollectionIsEmpty(){
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void checkAddBook(){
        library.addBook(book);
        assertEquals(1,library.collectionCount());
    }
}


