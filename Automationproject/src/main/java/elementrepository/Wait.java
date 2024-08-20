package elementrepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends Base {
	
	public void input() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Good morning");
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickbutton=driver.findElement(By.id("button-one"));
		wait.until(ExpectedConditions.elementToBeClickable(clickbutton));
		clickbutton.click();
		}
	
	public void sum()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("10");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("20");
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
		System.out.println(total.getText());
	}
	

	public static void main(String[] args) {
		Wait obj=new Wait();
		obj.initialiseBrowser();
		obj.input();
		obj.sum();
		
           
	}

}
