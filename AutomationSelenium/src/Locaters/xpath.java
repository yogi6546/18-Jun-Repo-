package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	
	//XPATH by attributes :-
	    /*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8390474859");
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7709216117");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //XPATH by Text :-
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();*/
	    
	    //XPATH by Contains :- 
	   // driver.findElement(By.xpath("//input[contains (@type,'text')]")).sendKeys("yogeshjagdale");
	    //driver.findElement(By.xpath("//input[contains (@type,'password')]")).sendKeys("jagdale");
	    //driver.findElement(By.xpath("//input[contains (@type,'submit')]")).click();
	
	    //XPATH by Index :-
	    driver.findElement(By.xpath("(//input)[3]")).sendKeys("gdsfs");
	    driver.findElement(By.xpath("(//input)[4]")).sendKeys("gdftrd");
	    driver.findElement(By.xpath("(//button)[1]")).click(); 
	    
}
}
