package POPUP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbro {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/sql/default.asp");
	
	driver.findElement(By.xpath("//a[@href='trysql.asp?filename=trysql_select_all']")).click();
	
	Set<String> set1 = driver.getWindowHandles();
	ArrayList<String> al1 = new ArrayList<String>(set1);
	driver.switchTo().window(al1.get(1));
	System.out.println(driver.getWindowHandles());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Restore Database']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	Thread.sleep(2000);
	al.accept();*/
	
	Thread.sleep(2000);
	Set<String> set2 = driver.getWindowHandles();
	ArrayList<String> al2 = new ArrayList<String>(set2);
	driver.switchTo().window(al2.get(0));
	System.out.println(set2);
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Submit Answer »']")).click();
	
	
	
	Thread.sleep(2000);
	Set<String> set3 = driver.getWindowHandles();
	ArrayList<String> al3 = new ArrayList<String>(set3);
	driver.switchTo().window(al3.get(1));
	System.out.println(set3);
	
	
	
	
	
	
 }
}
