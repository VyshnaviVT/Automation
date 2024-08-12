//Assignment for passing value Hi in three text field.

package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment  {
	WebDriver driver;
	
	public void input() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximize window
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> input=driver.findElements(By.xpath("//input[@type='text']"));
		for (WebElement webElement : input) {
			webElement.sendKeys("Hi");
		}
		
		
		
	   /* WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hi");
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("10");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("20");*/
		
	}

	public static void main(String[] args) {
		
		Assigment obj=new Assigment();
		obj.input();
	}
	
}
