package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling extends Base {

	public void fulltable() {

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}

	public void getRow() {

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(row.getText());
	}

	public void getColumn() {

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	   List<WebElement> column = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[6]"));
		for (WebElement columnvalue : column) {
			System.out.println(columnvalue.getText());
		}
	}
	
	public void searchElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Junior Technical Author";
		List<WebElement> searchElements=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for (WebElement search : searchElements) {
			if(search.getText().equals(input)) {
				System.out.println(search.getText());
			}
		}
		
	}
	
	public void searchparticularValue() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement value=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
	System.out.println(value.getText());
	}

	public static void main(String[] args) {
		TableHandling obj = new TableHandling();
		obj.initialiseBrowser();
		/*obj.fulltable();
		System.out.println("*********");
		obj.getRow();
		System.out.println("*********");
		obj.getColumn();
		System.out.println("*********");
		obj.searchElement();*/
		obj.searchparticularValue();
		

	}

}
