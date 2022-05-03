/*
 * Author: Nadir H. Kheiralla
 * 4-1 Milestone
 * SNHU CS-320 Software Test Automation & QA
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TaskTest {

	//Testing the Task ID variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName("Task ID cannot have more than 10 characters")
	void testInvalidTaskID() {
		Task task = new Task("213445634634", "TaskName", "TaskDescription");
		assertTrue(task.getTaskID().length() > 10);
	}
	
	//Testing the Task Name variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName ("Task name cannot have more than 20 characters")
	void testInvalidTaskName() {
		Task task = new Task("TaskID", "LongestTaskNameThatExistsInThisCode", "TaskDescription");
		assertTrue(task.getTaskName().length() >20);
	}
	
	//Testing the Task Description variable to make sure it does not have more than the specified required length in characters.
	@Test
	@DisplayName ("Task description cannot have more than 50 characters")
	void testInvalidTaskDescription() {
		Task task = new Task ("TaskID", "TaskName", "This description is going to be longer than the specified length in characters on purpose");
		assertTrue(task.getTaskDescription().length() >50);
	}
	
	//Testing the Task ID variable to make sure it is not null.
	@Test
	@DisplayName("Task ID cannot be null")
	void testTaskIDNotNull() {
		Task task = new Task(null, "TaskName", "TaskDescription");
		assertNull(task.getTaskID());
	}
	
	//Testing the Task Name variable to make sure it is not null.
	@Test
	@DisplayName("Task name cannot be null")
	void testTaskNameNotNull() {
		Task task = new Task("TaskID", null, "TaskDescription");
		assertNull(task.getTaskName());
	}
	
	//Testing the Task Description variable to make sure it is not null.
	@Test
	@DisplayName("Task description cannot be null")
	void testTaskDescriptionNotNull() {
		Task task = new Task("TaskID", "TaskName", null);
		assertNull(task.getTaskDescription());
	}
	
}
