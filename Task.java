/*
 * Author: Nadir H. Kheiralla
 * 4-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
public class Task {
	
	//Variables for Task
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	//Constructor
	public Task(String taskID, String taskName, String taskDescription) {
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}
	
	public String getTaskID() {
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	//Checks if 2 Task IDs are the same and makes sure that it is not null.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (taskID == null) {
			if (other.taskID != null)
				return false;
		}
		else if (!taskID.equals(other.taskID))
			return false;
		if (taskName == null) {
			if (other.taskName !=null)
				return false;
		}
		else if (!taskName.equals(other.taskName))
			return false;
		if (taskDescription == null) {
			if (other.taskDescription != null)
				return false;
		}
		else if (!taskDescription.equals(other.taskDescription))
			return false;
		return true;
	}
}
