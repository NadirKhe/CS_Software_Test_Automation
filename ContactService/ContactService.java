/*
 * Author: Nadir H. Kheiralla
 * 3-2 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
import java.util.ArrayList;

public class ContactService {
	
	//List containing the contacts
	private ArrayList<Contact> contacts;
	
	//Constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Adds contacts to the list if they are not present in the list
	public boolean add(Contact contact) {
		
		//Checks if the contact is already present
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		
		//If the contact is not present, this will add it
		if (!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact Added Successfully.");
			return true;
		}
		else {
			System.out.println("Contact is already present.");
			return false;
		}
	}
	
	//This method removes contacts from the contact list
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact was removed Successfully.");
				return true;
			}
		}
		System.out.println("Contact was not found.");
		return false;	
	}
	
	//This method updates the contact list
	public boolean update(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for (Contact c: contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals("") && !(firstName.length()>10))
					c.setFirstName(firstName);
				if (!lastName.equals("") && !(lastName.length()>10))
					c.setLastName(lastName);
				if (!address.equals("") && !(address.length()>30))
					c.setAddress(address);
				if (!phoneNumber.equals("") && (phoneNumber.length()==10))
					c.setPhoneNumber(phoneNumber);
				System.out.println("Contact list has been updated Successfully.");
				return true;	
			}
		}
		System.out.println("Contact is not present in list.");
		return false;
	}

}
