import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Magician", "Raymond E. Feist", "Fantasy");
    }

}
