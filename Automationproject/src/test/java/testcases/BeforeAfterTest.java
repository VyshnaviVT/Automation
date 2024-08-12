package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
	@Test
	public void add() {
		int sum,a=3,b=5;
		sum=a+b;
	    System.out.println("sum="+sum);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

}
