package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BefclassAfclass {
  @Test
  public void Display() {
	  System.out.println("morning");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Afterclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Before class");
  }

}
