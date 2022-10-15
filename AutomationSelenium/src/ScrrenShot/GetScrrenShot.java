package ScrrenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScrrenShot {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
    File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //driver cast to TakesScreenshot
    
    File Dest = new File ("E:\\Screenshot\\Yogi.jpg");//create object of File Class
	
    FileHandler.copy(Source, Dest);
    
}
}
