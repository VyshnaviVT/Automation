package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	WebDriver driver;

	public void alert() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximize window
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert.click();
		
		driver.switchTo().alert().accept(); //alert handling
	}
	
	public void alertHandle() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximize window
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alert2.click();
		
		driver.switchTo().alert().accept(); //alert handling
		
		driver.switchTo().alert().dismiss(); 
		
	}
	
	public void prompt() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximize window
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert3.click();
		
		driver.switchTo().alert().sendKeys("Vyshnavi"); //alert handling
		driver.switchTo().alert().accept(); 
		
		
		
	}
	public static void main(String[] args) {
		 
		Alerts obj=new Alerts();
		obj.alert();
	    obj.alertHandle();
		obj.prompt();
	}

}
