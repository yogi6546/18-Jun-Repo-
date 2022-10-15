import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	 /*Options op = driver.manage();
	 Window w = op.window();
	 w.maximize(); // Maximize the browser
	 Thread.sleep(2000);
	// w.minimize();*/// minimize the browser
	 
	 driver.manage().window().maximize(); //Method Chaining maximize
	 //driver.manage().window().minimize(); //method chaining minimize

	  Dimension D1 = new Dimension (100, 300);//change the size of browser
	  driver.manage().window().setSize(D1);
	  Thread.sleep(2000);
	  Point p1 = new Point (400, 200);//change the position of browser
	  driver.manage().window().setPosition(p1);
	  Thread.sleep(2000);
	  
	  
	//driver.get("https://web.whatsapp.com/");//Insert URL into Browser.
	driver.navigate().to("https://web.whatsapp.com/");
	
	
	
	String url = driver.getCurrentUrl();//fetch url of current browser
	System.out.println(url);
	String title = driver.getTitle();//fetch title of current browser
	System.out.println(title);
	
	Navigation nv = driver.navigate();
	nv.back();//Backward
	Thread.sleep(3000); //delay foe 3sec
	nv.forward();//Forward
	Thread.sleep(3000); //delayu for 3sec
	nv.refresh();//Refresh
	Thread.sleep(3000); //delay for 3sec
	//nv.to(url); //insert URL into browser
	
	//driver.close();//close the current tab of browser.
	driver.quit();// close all tab of browser.
}
}
