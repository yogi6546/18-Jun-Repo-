package Iframe;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/js/js_popup.asp"); 
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_alert\"]")).click();
	
	Thread.sleep(2000);
	Set<String> set1 = driver.getWindowHandles();	
	ArrayList<String> ar = new ArrayList<String>(set1);
	driver.switchTo().window(ar.get(1));
	System.out.println(set1);
	
	Thread.sleep(2000);
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
	driver.switchTo().frame(frame);
	
	//driver.switchTo().parentFrame();
	
	//driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
	
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	
	
	//Thread.sleep(2000);
	//Alert al = driver.switchTo().alert();
	//al.accept();
	
	//Thread.sleep(2000);
	//driver.switchTo().defaultContent();
}
}
