/*
 * Author: Nadir H. Kheiralla
 * 3-2 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ContactServiceTest {

	//Testing the add method if the information provided should work
	@Test
	public void testMethodAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
	
	//Testing the add method if the provided information should not work
	@Test
	public void testMethodAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(false, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
	
	//Testing the delete method when the provided information exists and should work
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.remove("C03"));
		assertEquals(true, cs.remove("C02"));
	}
	
	//Testing the delete method when the provided information should not work
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(false, cs.remove("C04"));
		assertEquals(true, cs.remove("C02"));
	}
	
	//Testing the update method when the provided information should work
	@Test
	public void testMethodUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.update("C02", "Jannett", "Doey", "1023", ""));
		assertEquals(true, cs.update("C03", "Bill", "Buxton","45925", "14 Main St"));
	}
	
	//Testing the update method when the provided information should not work
	@Test
	public void testMethodUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C01", "John", "Doe", "12345", "10 Main St");
		Contact c2 = new Contact("C02", "Jane", "Doe", "6789", "11 Main St");
		Contact c3 = new Contact("C03", "Bill", "Bane", "01234", "12 Main St");
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(false, cs.update("C04", "Bonny", "Boy", "12345", "15 Golf St"));
		assertEquals(true, cs.update("C03", "Bill", "Buxton", "40569", "14 Main St"));
	}
}


