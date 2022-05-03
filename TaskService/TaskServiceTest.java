/*
 * Author: Nadir H. Kheiralla
 * 4-1 Milestone
 * SNHU ts-320 Software Test Automation & QA
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TaskServiceTest {

	//Testing the add method if the information provided should work
	@Test
	public void testMethodAddPass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
	}
	
	//Testing the add method if the provided information should not work
	@Test
	public void testMethodAddFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(false, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
	}
	
	//Testing the delete method when the provided information exists and should work
	@Test
	public void testMethodDeletePass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
		
		assertEquals(true, ts.remove("T03"));
		assertEquals(true, ts.remove("T02"));
	}
	
	//Testing the delete method when the provided information should not work
	@Test
	public void testMethodDeleteFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
		
		assertEquals(false, ts.remove("T04"));
		assertEquals(true, ts.remove("T02"));
	}
	
	//Testing the update method when the provided information should work
	@Test
	public void testMethodUpdatePass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
		
		assertEquals(true, ts.update("T02", "Waxing", "User is now waxing."));
		assertEquals(true, ts.update("T03", "Walking", "User is now walking."));
	}
	
	//Testing the update method when the provided information should not work
	@Test
	public void testMethodUpdateFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("T01", "Reading", "User is now reading.");
		Task t2 = new Task("T02", "Cleaning", "User is now cleaning.");
		Task t3 = new Task("T03", "Running", "User is now running.");
		assertEquals(true, ts.add(t1));
		assertEquals(true, ts.add(t2));
		assertEquals(true, ts.add(t3));
		
		assertEquals(false, ts.update("T04", "Driving", "User is now driving."));
		assertEquals(true, ts.update("T03", "Jumping", "User is now jumping."));
	}
}


