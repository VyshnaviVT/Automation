package elementrepository;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {
  WebDriver driver;
	public void actions() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); // to maximize window
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag1).click();
		action.doubleClick(drag1).perform();
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag1, drop).build().perform();
	}
	public static void main(String[] args) {
		ActionClasses  obj=new ActionClasses ();
		obj.actions();
	}

}
