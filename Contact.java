/*
 * Author: Nadir H. Kheiralla
 * 3-2 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */

public class Contact {

	//Variables for the contacts
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//Constructor
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*Checks if two contacts are the same and the variables are within the required parameters of
	 * the specified length of 10 characters or less for all but the address variable which requires
	 * the length of 30 or less. All variables cannot be null.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (contactID == null) {
			if (other.contactID != null)
				return false;
		}
		else if (!contactID.equals(other.contactID))
			return false;
		if (firstName == null) {
			if (other.firstName !=null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (address == null) {
			if (address != null)
				return false;
		}
		else if (!address.equals(other.address))
			return false;
		return true;
		}

}
