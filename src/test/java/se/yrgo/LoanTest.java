package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.*;
import se.yrgo.utilities.*;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
        Customer customer = new Customer("Mr. ", "John", "Smith", "Test Road",
                "222444333","JohnSmirth@test.com",222,GenderType.MALE);
        Book book = new Book(123,"Test Book", "Testington", "1122493433","999",999);
        Loan loan = new Loan(33,customer, book);

        assertEquals(LocalDate.now().plusDays(14),loan.getDueDate());

   }
}