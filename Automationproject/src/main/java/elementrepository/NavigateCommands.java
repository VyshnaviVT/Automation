package elementrepository;

public class NavigateCommands extends Base {

	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		
		NavigateCommands obj2=new NavigateCommands();
		obj2.initialiseBrowser();
		obj2.navigateCommands();
		obj2.driverQuitClose();
	}

}
