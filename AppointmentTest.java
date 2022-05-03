/*
 * Author: Nadir H. Kheiralla
 * 5-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	
	//Date variable for a valid response of test
	Date currentDate = new Date();

	//Testing the AppointmentID to ensure it is within the specified length of allowed characters.
	@Test
	@DisplayName("AppointmentID cannot have more than 10 characters.")
	void testInvalidAppointmentID() {	
		Appointment appointment = new Appointment("192384574832", currentDate, "Dental");
		assertTrue(appointment.getAppointmentID().length() > 10);
	}
	
	//Testing the Appointment Date to ensure it is not past the present date.
	@Test
	@DisplayName("Appointment Date cannot be a date that has past.")
	void testInvalidAppointmentDate() {
		
		//Creating new appointment date variable to test with
		Calendar ca1 = Calendar.getInstance();
		ca1.set(Calendar.MONTH, 11);
		ca1.set(Calendar.DATE, 15);
		ca1.set(Calendar.YEAR, 2020);
		Date previousDate = ca1.getTime();
		
		Appointment appointment = new Appointment("A01", previousDate, "Dental");
		assertTrue(appointment.getAppointmentDate().before(new Date()));
	}
	
	//Testing the Appointment Description to ensure that it is within the specified length of allowed characters.
	@Test
	@DisplayName("Appointment description cannot have more than 50 characters.")
	void testInvalidAppointmentDiscription() {
		Appointment appointment = new Appointment("A01", currentDate, "This description is going to be longer than the specified length in characters on purpose");
		assertTrue(appointment.getAppointmentDescription().length() > 50);
	}
	
	//Testing the AppointmentID to ensure it is not a null value.
	@Test
	@DisplayName("Appointment ID cannot be null.")
	void testAppointmentIDNotNull() {
		Appointment appointment = new Appointment(null, currentDate, "Dental");
		assertNull(appointment.getAppointmentID());
	}
	
	//Testing the Appointment Date to ensure it is not a null value.
	@Test
	@DisplayName("Appointment Date cannot be null.")
	void testAppointmentDateNotNull() {
		Appointment appointment = new Appointment("A01", null, "Dental");
		assertNull(appointment.getAppointmentDate());
	}
	
	//Testing the Appointment Description to ensure it is not a null value.
	@Test
	@DisplayName("Appointment description cannot be null.")
	void testAppointmentDescriptionNotNull() {
		Appointment appointment = new Appointment("A01", currentDate, null);
		assertNull(appointment.getAppointmentDescription());
	}

}
