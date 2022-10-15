package POPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	/*driver.findElement(By.xpath("//input[@name='alert']")).click();
	Thread.sleep(3000);
	Alert al = driver.switchTo().alert(); //switch to alert popup
	Thread.sleep(2000);
	al.accept(); //OK-click
	
	
	driver.findElement(By.xpath("//input[@name='confirmation']")).click();
	Thread.sleep(3000);
	Alert Al = driver.switchTo().alert(); //switch to alert popup
	Thread.sleep(2000);
	Al.dismiss(); //Cancel-click
	
	
	driver.findElement(By.xpath("//input[@name='prompt']")).click();
	Thread.sleep(3000);
	Alert A1 = driver.switchTo().alert(); //switch to alert popup
	Thread.sleep(2000);
	A1.sendKeys("Yogi"); // Pass the key
	Thread.sleep(2000);
	A1.accept(); //OK-click*/
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yogesh Jagdale");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	Thread.sleep(2000);
	al.accept();
	Thread.sleep(2000);
	
	Alert Al = driver.switchTo().alert();
	Thread.sleep(2000);
	Al.accept();
	
	//al.dismiss();
	
	//al.sendKeys("yogi");
	
	
	
}
}
