package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();  //chrome browser launching
		driver.get("https://selenium.qabible.in/index.php"); 
		
		// WebDriver driver=new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
	}

}
