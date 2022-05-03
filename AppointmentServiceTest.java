/*
 * Author: Nadir H. Kheiralla
 * 5-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentServiceTest {
	
	//Date variable for a valid response of test
	Date currentDate = new Date();

	//Testing the add method if the provided information should work
	@Test
	public void testMethodAddPass() {
		AppointmentService as = new AppointmentService();
		Appointment a1 = new Appointment("A01", currentDate, "Dental");
		Appointment a2 = new Appointment("A02", currentDate, "Gym");
		Appointment a3 = new Appointment("A03", currentDate, "Dinner");
		assertEquals(true, as.add(a1));
		assertEquals(true, as.add(a2));
		assertEquals(true, as.add(a3));
	}
	
	//Testing the add method if the provided information should not work
	@Test
	public void testMethodAddFail() {
		AppointmentService as = new AppointmentService();
		Appointment a1 = new Appointment("A01", currentDate, "Dental");
		Appointment a2 = new Appointment("A02", currentDate, "Gym");
		Appointment a3 = new Appointment("A03", currentDate, "Dinner");
		assertEquals(true, as.add(a1));
		assertEquals(false, as.add(a1));
		assertEquals(true, as.add(a2));
		assertEquals(true, as.add(a3));
	}
	
	//Testing the remove method if the provided information should work
	@Test
	public void testMethodRemovePass() {
		AppointmentService as = new AppointmentService();
		Appointment a1 = new Appointment("A01", currentDate, "Dental");
		Appointment a2 = new Appointment("A02", currentDate, "Gym");
		Appointment a3 = new Appointment("A03", currentDate, "Dinner");
		assertEquals(true, as.add(a1));
		assertEquals(true, as.add(a2));
		assertEquals(true, as.add(a3));
		
		assertEquals(true, as.remove("A02"));
		assertEquals(true, as.remove("A03"));
	}
	
	//Testing the remove method if the provided information should not work
	@Test
	public void testMethodRemoveFail() {
		AppointmentService as = new AppointmentService();
		Appointment a1 = new Appointment("A01", currentDate, "Dental");
		Appointment a2 = new Appointment("A02", currentDate, "Gym");
		Appointment a3 = new Appointment("A03", currentDate, "Dinner");
		assertEquals(true, as.add(a1));
		assertEquals(true, as.add(a2));
		assertEquals(true, as.add(a3));
		
		assertEquals(false, as.remove("A04"));
		assertEquals(true, as.remove("A02"));
	}

}
