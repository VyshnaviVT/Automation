package elementrepository;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String title = driver.getTitle(); // to get title of the page
		System.out.println(title);
		String url = driver.getCurrentUrl(); // to get url of website
		System.out.println(url);
		String pagesourse = driver.getPageSource(); // to get html code
		System.out.println(pagesourse);
	}

	public static void main(String[] args) {
		BrowserCommands obj = new BrowserCommands();
		obj.initialiseBrowser();
		obj.browserCommands();
	}
}
