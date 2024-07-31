package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewProject extends Base {
	
	public void input() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Good morning");
		WebElement clickbutton=driver.findElement(By.id("button-one"));
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
		NewProject obj=new NewProject();
		obj.initialiseBrowser();
		obj.input();
		obj.sum();
		
           
	}

}
