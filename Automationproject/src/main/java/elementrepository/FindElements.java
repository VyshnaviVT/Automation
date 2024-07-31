package elementrepository;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	WebDriver driver;
	 public void elements() {
		 driver=new ChromeDriver();
		 driver.get("https://selenium.qabible.in/index.php");
		 driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		 List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']")); 
		 for (WebElement webElement : checkboxes) {
		 webElement.click();
		}
	 }

	public static void main(String[] args) {
		 
		FindElements obj=new FindElements();
		obj.elements();
	}

}
