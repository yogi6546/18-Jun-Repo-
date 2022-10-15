package AutomateAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys("8390474859");
	WebElement press = driver.findElement(By.xpath("//input[@id='continue']"));
	press.click();
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Pass@1234");
	WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signin.click();
	Thread.sleep(2000);
	
	
	
	
	
}
}
