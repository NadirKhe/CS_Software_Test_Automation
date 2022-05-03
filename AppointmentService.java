/*
 * Author: Nadir H. Kheiralla
 * 5-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */

import java.util.ArrayList;

public class AppointmentService {
	
	//Static list for Appointments
	private ArrayList<Appointment> appointments;
	
	//Constructor
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	//Method that adds appointments if they are not already present
	public boolean add(Appointment appointment) {
		
		//If the appointment is present
		boolean alreadyPresent = false;
		for (Appointment a : appointments) {
			if (a.equals(appointment)) {
				alreadyPresent = true;
			}
		}
		
		//If the appointment is not present
		if (!alreadyPresent) {
			appointments.add(appointment);
			System.out.println("Appointment added Successfully.");
			return true;
		}
		else {
			System.out.println("Appintment is already present.");
			return false;
		}
	}
	
	//Method that removes appointments
	public boolean remove(String appointmentID) {
		for (Appointment a : appointments) {
			if (a.getAppointmentID().equals(appointmentID)) {
				appointments.remove(a);
				System.out.println("Appointment was removed.");
				return true;
			}
		}
		System.out.println("Appointment was not found.");
		return false;
	}

}
