package se.yrgo;
import se.yrgo.models.Book;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
        Book book1 = new Book(999, "The Count of Monte Cristo","Alexandre Dumas", "999","999",900);
        Book book2 = new Book(999, "The Count of Monte Cristo","Alexandre Dumas", "999","999",900);
        assertEquals(book1,book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
        Book book1 = new Book(123, "Dune","Frank Herbert", "2223","1243",896);
        Book book2 = new Book(633, "A Confederacy of Dunces","John Kennedy Toole", "1232","8876",336);
        assertNotEquals(book1,book2);
	}
}
