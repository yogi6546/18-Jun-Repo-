package AutomateFlipkart;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	username.sendKeys("8390474859");
	password.sendKeys("Pass@123");
	login.click();
	Thread.sleep(3000);
	
	/*WebElement electronics = driver.findElement(By.xpath("(//img[@class=\"_396cs4  _3exPp9\"])[4]"));
	electronics.click();
	Thread.sleep(5000);*/
	
	WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
	cart.click();
	Thread.sleep(4000);
	
	WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	search.sendKeys("canon 200d");
	Thread.sleep(3000);
	WebElement enter = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	enter.click();
	Thread.sleep(3000);
	WebElement camera = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	camera.click();
	Thread.sleep(5000);
	
	Set<String> set1 = driver.getWindowHandles();
	ArrayList<String> arl = new ArrayList<String>(set1);
	driver.switchTo().window(arl.get(1));
	System.out.println(set1);
	Thread.sleep(4000);
	WebElement addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	addtocart.click();
	Thread.sleep(5000);
	
	WebElement deliverypincode = driver.findElement(By.xpath("//button[text()='Enter Delivery Pincode']"));
	deliverypincode.click();
	Thread.sleep(3000);
	WebElement enterpincode = driver.findElement(By.xpath("//input[@placeholder='Enter pincode']"));
	enterpincode.sendKeys("411046");
	Thread.sleep(3000);
	WebElement submitpin = driver.findElement(By.xpath("//div[text()='Submit']"));
	submitpin.click();
	Thread.sleep(3000);
	
	WebElement myaccount = driver.findElement(By.xpath("//div[text()='My Account']"));
	Thread.sleep(3000);
    Actions  act = new  Actions (driver);
    act.moveToElement(myaccount).perform();
    Thread.sleep(2000);
    WebElement logout = driver.findElement(By.xpath("//div[text()='Logout']"));
	logout.click();
	
	//driver.quit();
		
}
}
