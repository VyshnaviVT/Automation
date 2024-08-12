package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Form extends BaseClassLaunch {
	
	@Test
	public void forms() {
		WebElement entermessage = driver.findElement(By.id("single-input-field"));
		entermessage.sendKeys("welcome");
		WebElement showmessage = driver.findElement(By.id("button-one"));
		showmessage.click();
		WebElement valuea = driver.findElement(By.id("value-a"));
		valuea.sendKeys("10");
		WebElement valueb = driver.findElement(By.id("value-b"));
		valueb.sendKeys("11");
		WebElement gettotal = driver.findElement(By.id("button-two"));
		gettotal.click();

	}
}
