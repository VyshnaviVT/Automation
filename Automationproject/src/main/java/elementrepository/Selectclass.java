package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
	  WebDriver driver;
		public void select() {
			driver=new ChromeDriver();
			driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	        driver.manage().window().maximize(); // to maximize window
			WebElement drop1=driver.findElement(By.id("dropdowm-menu-1"));
			drop1.click();
			
			Select select=new Select(drop1);
		//	select.selectByVisibleText("JAVA");
			
		//	select.selectByIndex(3);
			
			select.selectByValue("python");
			
		//	WebElement element=select.getAllSelectedOptions();
			
		}
	public static void main(String[] args) {
		Selectclass obj=new Selectclass();
		obj.select();
           
	}

}
