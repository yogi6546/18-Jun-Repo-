package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	
	/*WebElement LoginButton =  driver.findElement(By.tagName("button"));
	Thread.sleep(2000);
	LoginButton.click();*/
	
	/*WebElement id = driver.findElement(By.id("email"));
	Thread.sleep(3000);
	id.sendKeys("8390474859");
	Thread.sleep(2000);
	WebElement id1 = driver.findElement(By.id("pass"));
	Thread.sleep(2000);
	id1.sendKeys("8390474859");
	
	Thread.sleep(2000);
	driver.findElement(By.id("loginbutton")).click();*/
	
	WebElement email = driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt"));
	email.sendKeys("8390474859");
	Thread.sleep(3000);
	WebElement pass = driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
	pass.sendKeys("7709216117");
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
	login.click();
	
	/*driver.findElement(By.name("email")).sendKeys("8390474859");
	Thread.sleep(2000);
	
	driver.findElement(By.name("pass")).sendKeys("7709216117");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login")).click();*/
	
	
}
}
