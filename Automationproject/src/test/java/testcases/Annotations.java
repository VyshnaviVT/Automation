package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
	@Test
	public void show() {
		System.out.println("hello");
	}

	@Test
	public void shows() {
		System.out.println("hi");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

}
