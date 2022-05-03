/*
 * Author: Nadir H. Kheiralla
 * 5-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */

	import java.util.Date;

public class Appointment {
	
	//Variables for the Appointment Service
	String appointmentID;
	Date appointmentDate;
	String appointmentDescription;
	
	//Constructor
	public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentDescription = appointmentDescription;
	}
	
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public void setAppointmentDescription(String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}
	
	//Checking to make sure there doesn't exist another same appointment with that ID
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (appointmentID == null) {
			if (other.appointmentID != null)
				return false;
		}
		else if (!appointmentID.equals(other.appointmentID))
			return false;
		if (appointmentDate == null) {
			if (other.appointmentDate !=null)
				return false;
		}
		else if (!appointmentDate.equals(other.appointmentDate))
			return false;
		if (appointmentDescription == null) {
			if (other.appointmentDescription != null)
				return false;
		}
		else if (!appointmentDescription.equals(other.appointmentDescription))
			return false;
		return true;
	}

}
