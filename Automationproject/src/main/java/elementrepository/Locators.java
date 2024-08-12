package elementrepository;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void id() {
      WebElement elementname = driver.findElement(By.id("single-input-field")); // to find an element using id

	}

	public void classLocator() {

		WebElement element = driver.findElement(By.className("navbar-brand")); // to find an element using classname
		WebElement element5 = driver.findElement(By.className("navbar-toggler-icon"));

	}

	public void nameLocator() {

		WebElement element2 = driver.findElement(By.name("states[]")); // to find an element using name
		WebElement element3 = driver.findElement(By.name("daterange"));
		WebElement element4 = driver.findElement(By.name("from"));
	}

	public void linkText() {
		WebElement element6 = driver.findElement(By.linkText("check-box-demo.php"));
	}

	public void partiallinkText() {
		WebElement element7 = driver.findElement(By.partialLinkText("radio-button"));
	}

	public void cssSelector() {
		WebElement element8 = driver.findElement(By.cssSelector("input#gridCheck")); // tagname#value of id
		WebElement element9 = driver.findElement(By.cssSelector("input.form-check-input")); // tagname.value of class
		WebElement element10 = driver.findElement(By.cssSelector("input[class=form-check-input]")); // tagname[
		WebElement element11 = driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]")); // tagname.attribute
																											// value[attribute
																											// type=attribute
																											// value]
	}

	public void xpaths() {
		WebElement element12 = driver
				.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input")); // absolute
																														// xpath
		WebElement element13 = driver.findElement(By.xpath("//html/body/section/div/div/div[1]/div/div/ul/li[2]/a")); // absolute
																														// xpath
		WebElement element14 = driver.findElement(By.xpath("//input[@type='checkbox']")); // Relative xpath
	}

	public void dynamicXpath() {
		WebElement element15 = driver.findElement(By.xpath("//button[contains(@id,'-one')]")); // contains()-syntax://tag[contains(@type,'partial
																								// value']
		WebElement element16 = driver.findElement(By.xpath("//button[text()='Show Message']")); // text()-syntax: //tag
																								// name[text()='value']
		WebElement element17 = driver
				.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler-icon']")); // xpath
																														// axes
																														// method-syntax:relative
																														// xpath//child::child_tagname[@attribute
																														// type='attribute
																														// value']
		WebElement element18 = driver.findElement(By.xpath("//button[@id='button-one']//parent::form")); // xpath axes
																											// method
																											// parent-syntax:relative
																											// xpath//parent::parent_tagname
		WebElement following1 = driver
				.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")); // following
																											// syntax-
		WebElement following2 = driver.findElement(
				By.xpath("//span[@class='navbar-toggler-icon']//following::div[@class='collapse navbar-collapse']"));
	}

	public static void main(String[] args) {

	}

}
