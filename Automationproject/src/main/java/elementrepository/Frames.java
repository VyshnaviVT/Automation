package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	 WebDriver driver;
		public void frameExample() {
			driver=new ChromeDriver();
			driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	        driver.manage().window().maximize(); // to maximize window
			WebElement frameeg=driver.findElement(By.id("a077aa5e"));
			driver.switchTo().frame(frameeg); //for those frame which doesnt
			WebElement demopage=driver.findElement(By.xpath("//a[@href='https://www.guru99.com/live-selenium-project.html']"));
			demopage.click();
		//	frameeg.click();
		}
	public static void main(String[] args) {
		Frames obj=new Frames();
		obj.frameExample();

	}

}
