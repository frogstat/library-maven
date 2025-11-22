package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.BookCatalog;
import se.yrgo.models.BookNotFoundException;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
        int currentBookIndex = bc.getNumberOfBooks();
        bc.addBook(book1);
        assertSame(book1,bc.getBookArray()[currentBookIndex]);
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        assertSame(book1,bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
        assertSame(book1,bc.findBook("LEARninG jAvA"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        assertSame(book1,bc.findBook("      Learning Java    "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
        assertThrows(BookNotFoundException.class, () -> bc.findBook("thisB0okD0esNotExist!¡@£€€¥"));
	}

}
