package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	//driver.get("https://www.amazon.com/");
	//Thread.sleep(2000);
	
	//WebElement changelanguage = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
	//Actions act = new Actions (driver);
	
	//act.moveToElement(changelanguage).perform();
	//Thread.sleep(2000);
	//act.contextClick().perform(); //right click.
	//act.contextClick(changelanguage).perform(); //move to element & right click.
	
	//act.click().perform(); //left click
	//act.click(changelanguage).perform();// move to element & left click.
	
	//act.doubleClick().perform(); // double click.
	//act.doubleClick(changelanguage).perform(); // move to element & double click.
	
	//act.moveToElement(changelanguage).contextClick().perform();
	//act.moveToElement(changelanguage).click().perform();
	//act.moveToElement(changelanguage).doubleClick().perform();
	
	//DRSG AND DROP METHOD :-
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	
	WebElement From = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	Thread.sleep(3000);
	WebElement To = driver.findElement(By.xpath("(//h3[@align=\"center\"])[2]"));
	Thread.sleep(3000);
	Actions act = new Actions (driver);
	Thread.sleep(3000);
	act.dragAndDrop(From, To).build().perform();
	
	
	
	
	
}
}
