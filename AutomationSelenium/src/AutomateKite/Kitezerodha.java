package AutomateKite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kitezerodha {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(3000);
	
	WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
	Username.sendKeys("QIS350");
	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
	Password.sendKeys("Pass@123");
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	Login.click();
	Thread.sleep(2000);
	
	WebElement pin = driver.findElement(By.xpath("//input[@type='text']"));
	pin.sendKeys("207243");
	WebElement submitpin = driver.findElement(By.xpath("//button[@type='submit']"));
	submitpin.click();
	Thread.sleep(8000);
	
	WebElement SearchBar = driver.findElement(By.xpath("//input[@type='text']"));
	SearchBar.sendKeys("TATASTEEL");
	Thread.sleep(2000);
	WebElement enter = driver.findElement(By.xpath("//span[@class='icon icon-search']"));
	enter.click();
	Thread.sleep(3000);
	
	WebElement ID = driver.findElement(By.xpath("//span[@class='user-id']"));
	ID.click();
	Thread.sleep(2000);
	WebElement profile = driver.findElement(By.xpath("(//a[@href='/profile'])[2]"));
	profile.click();
	Thread.sleep(3000);
	
	WebElement ID1 = driver.findElement(By.xpath("//span[@class='user-id']"));
	ID1.click();
	Thread.sleep(2000);
	WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
	logout.click();
	
}
}
