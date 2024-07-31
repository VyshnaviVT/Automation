package elementrepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {
	
	public void checkboxNav()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
	}
    public void radiobutton()
    {
    	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
    	WebElement radiobuttons=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
    	radiobuttons.click();
    	WebElement shows=driver.findElement(By.xpath("//button[@id='button-one']"));
    	shows.click();
    	System.out.println(radiobuttons.isSelected());
    }
    	
    	public static void main(String[] args) {
    
		Checkbox obj=new Checkbox();
		obj.initialiseBrowser();
		obj.checkboxNav();
		obj.radiobutton();
		

	}

}
