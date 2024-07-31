package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment  {
	WebDriver driver;
	
	public void input() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Good morning");
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("10");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("20");
		
	}

	public static void main(String[] args) {
		
		Assigment obj=new Assigment();
		obj.input();
	}

}
