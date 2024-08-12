package elementrepository;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {
	 WebDriver driver;
		public void multiWindow() {
			driver=new ChromeDriver();
			driver.navigate().to("https://webdriveruniversity.com/");
	        driver.manage().window().maximize(); // to maximize window
	        WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	        contactus.click();
	        WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	        login.click();
	        
	        String parent=driver.getWindowHandle();
	        System.out.println("parent window:"+parent);
	     Set<String> allwindow=driver.getWindowHandles();
	     String title="";
	     
	    // System.out.println("All window:"+allwindow);
	     for(String temp:allwindow)
	     {
	    	 if(temp.equals(parent))
	    		 System.out.println("windows:"+temp);
	    	 driver.switchTo().window(temp);
	    	//System.out.println(driver.getTitle()); 
	    	 title=driver.getTitle();
	     }
	     if(title.equals("WebDriver | Login Portal")) {
	    	
	    	 WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
	    	 username.sendKeys("obsqura");
	    	 }
	     
	     if(title.equals("WebDriver | Contact Us")) {
		    	
	    	 WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
	    	 firstname.sendKeys("vysh");
	    	 
	     }
		}
	public static void main(String[] args) {
		
		MultiWindowHandling obj=new MultiWindowHandling();
		obj.multiWindow();
		}
}
