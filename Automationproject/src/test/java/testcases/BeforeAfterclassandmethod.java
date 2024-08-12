package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterclassandmethod {
  @Test
  public void add() {
		int sum,a=3,b=5;
		sum=a+b;
	    System.out.println("sums="+sum);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Befores method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Afters method");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Befores class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Afters class");
  }

}
