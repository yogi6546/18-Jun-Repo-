package ScrolUpScrolDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class class1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN1274G91653&p=w3school+tutorial");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.Scrollby(-50,-100)");
}
}
