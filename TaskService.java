/*
 * Author: Nadir H. Kheiralla
 * 4-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
import java.util.ArrayList;

public class TaskService {
	
	//Static list of tasks
	private ArrayList<Task> tasks;
	
	//Constructor
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	//Adds tasks to the list if they are not present already
	public boolean add(Task task) {
		
		
		//Checking if the task is present
		boolean alreadyPresent = false;
		for (Task t : tasks) {
			if (t.equals(task)) {
				alreadyPresent = true;
			}
		}
		
		//if the task is not present
		if (!alreadyPresent) {
			tasks.add(task);
			System.out.println("Task added Successfully.");
			return true;
		}
		else {
			System.out.println("Task is already present.");
			return false;
		}
	}
	
	//This method is to remove tasks from the list
	public boolean remove(String taskID) {
		for (Task t: tasks) {
			if (t.getTaskID().equals(taskID)) {
				tasks.remove(t);
				System.out.println("Task was removed Successfully.");
				return true;
			}
		}
		System.out.println("Task was not found.");
		return false;
	}
	
	//This method updates the contact list
		public boolean update(String taskID, String taskName, String taskDescription) {
			for (Task t: tasks) {
				if (t.getTaskID().equals(taskID)) {
					if (!taskName.equals("") && !(taskName.length()>20))
						t.setTaskName(taskName);
					if (!taskDescription.equals("") && !(taskDescription.length()>50))
						t.setTaskDescription(taskDescription);
					System.out.println("Tasks have been updated Successfully.");
					return true;	
				}
			}
			System.out.println("Task is not present in list.");
			return false;
		}
	
}
