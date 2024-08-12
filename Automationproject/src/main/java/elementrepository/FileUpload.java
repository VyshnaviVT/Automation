package elementrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	WebDriver driver;

	public void fileuploadEg() {
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize(); // to maximize window
		WebElement select = driver.findElement(By.xpath("//input[@id='file-upload']"));
		select.sendKeys("C:\\Users\\vyshnavi\\Downloads\\sql.pdf");
		WebElement upload = driver.findElement(By.id("file-submit"));
		upload.click();
		}
	
	public void robotClasseg() throws AWTException {
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize(); // to maximize window
		WebElement select = driver.findElement(By.xpath("//input[@id='file-upload']"));
		select.click();
		StringSelection s=new StringSelection("C:\\Users\\vyshnavi\\Downloads\\sql.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {
		FileUpload obj = new FileUpload();
	//	obj.fileuploadEg();
		obj.robotClasseg();
	}

}
