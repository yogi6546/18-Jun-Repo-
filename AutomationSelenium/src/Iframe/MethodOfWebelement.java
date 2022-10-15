package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfWebelement {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	/*WebElement web = driver.findElement(By.xpath("//label[text()='Female']"));
	web.click();

	Thread.sleep(2000);
	System.out.println(web.isSelected());*/
	
	WebElement web = driver.findElement(By.xpath(" //button[@type=\"submit\"]"));
	
	//System.out.println(web.isEnabled());
	
	//System.out.println(web.isDisplayed());
	
	System.out.println(web.getAttribute("name"));
	

	
	
	
}
}
