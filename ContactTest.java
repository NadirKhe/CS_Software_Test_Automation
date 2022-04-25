/*
 * Author: Nadir H. Kheiralla
 * 3-2 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {

	//Testing the Contact ID variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testInvalidContactID() {
		Contact contact = new Contact("213445634634", "FirstName", "LastName", "PhoneNumber", "Address");
		assertTrue(contact.getContactID().length() > 10);
	}
	
	//Testing the First Name variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName ("Contact first name cannot have more than 10 characters")
	void testInvalidFirstName() {
		Contact contact = new Contact("ContactID", "LongestFirstNameEver", "LastName", "PhoneNumber", "Address");
		assertTrue(contact.getFirstName().length() >10);
	}
	
	//Testing the Last Name variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName ("Contact last name cannot have more than 10 characters")
	void testInvalidLastName() {
		Contact contact = new Contact ("ContactID", "FirstName", "LongestLastNameEver", "PhoneNumber", "Address");
		assertTrue(contact.getLastName().length() >10);
	}
	
	//Testing the Phone Number variable to make sure it does not have more or less of the specified required length in characters.
	@Test
	@DisplayName ("Contact phone number cannot have more or less than 10 characters")
	void testInvalidPhoneNumber() {
		Contact contact = new Contact ("ContactID", "FirstName", "LastName", "01010", "Address");
		assertTrue (contact.getPhoneNumber().length() !=10);
	}
	
	//Testing the Address variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName ("Contact address cannot have more than 30 characters")
	void testInvalidAddress() {
		Contact contact = new Contact ("ContactID", "FirstName", "LastName", "PhoneNumber", "This Address cannot be real as it is the longest one ever on the Planet");
		assertTrue(contact.getAddress().length() > 30);
	}
	
	//Testing the Contact ID variable to make sure it is not null.
	@Test
	@DisplayName("ContactID cannot be null")
	void testContactIDNotNull() {
		Contact contact = new Contact(null, "FirstName", "LastName", "PhoneNumber", "Address");
		assertNull(contact.getContactID());
	}
	
	//Testing the First Name variable to make sure it is not null.
	@Test
	@DisplayName("First name cannot be null")
	void testFirstNameNotNull() {
		Contact contact = new Contact("ContactID", null, "LastName", "PhoneNumber", "Address");
		assertNull(contact.getFirstName());
	}
	
	//Testing the Last Name variable to make sure it is not null.
	@Test
	@DisplayName("Last name cannot be null")
	void testLastNameNotNull() {
		Contact contact = new Contact("ContactID", "FirstName", null, "PhoneNumber", "Address");
		assertNull(contact.getLastName());
	}
	
	//Testing the Phone Number variable to make sure it is not null.
	@Test
	@DisplayName("Phone number cannot be null")
	void testPhoneNumberNotNull() {
		Contact contact = new Contact("ContactID", "FirstName", "LastName", null, "Address");
		assertNull(contact.getPhoneNumber());
	}
	
	//Testing the Address variable to make sure it is not null.
	@Test
	@DisplayName("Address cannot be null")
	void testAddressNotNull() {
		Contact contact = new Contact("ContactID", "FirstName", "LastName", "PhoneNumber", null);
		assertNull(contact.getAddress());
	}
}
