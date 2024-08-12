package testcases;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 3)             //setting proirity for tests to run
  public void display() {
	  System.out.println("TestNG");
  }
  
  @Test(priority = 1) 
  
  public void show() {
	  System.out.println("Show TestNG");
  }
	  
	  @Test(priority = 2)
	  
	  public void shows() {
		  System.out.println("Show2 TestNG");
		  
	  
  }
}
