package POPUP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_PopUp {
private static final Object actUrl = null;

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/sql/default.asp");
	
	driver.findElement(By.xpath("//a[@href='trysql.asp?filename=trysql_select_all']")).click();
	
	String mainWindowID = driver.getWindowHandle(); //main window ID 
	String expUrl = "https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all";
	Set<String> Id = driver.getWindowHandles(); //main window + child window ID
	
	for (String s : Id) {
		
		System.out.println(s);
		
		driver.switchTo().window(s);
		String actUrl = driver.getCurrentUrl();
	}
	 
	if (expUrl.equals(actUrl)) {
		System.out.println("correct window");
	}
	else {
		System.out.println("Wrong Window");
	}
}
}
