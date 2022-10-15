package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("http://practice.cybertekschool.com/dropdown");
	
	WebElement language = driver.findElement(By.xpath("//select[@name='Languages']"));
	
	Select s = new Select (language);
	Thread.sleep(1000);
	s.selectByValue("java");
	Thread.sleep(1000);
	s.selectByValue("js");
	Thread.sleep(1000);
	s.selectByValue("c#");
	Thread.sleep(2000);
	s.deselectByIndex(0);
	
    // Deselect Method :-	
	/*Thread.sleep(1000);
	s.deselectByIndex(0);
	Thread.sleep(1000);
	s.deselectByValue("js");
	Thread.sleep(1000);
	s.deselectByVisibleText("C#");
	//Thread.sleep(2000);
	//s.deselectAll();*/
	
	System.out.println(s.getFirstSelectedOption().getText());
	/*WebElement firstselect = s.getFirstSelectedOption();
	System.out.println(firstselect);
	System.out.println(s.getFirstSelectedOption().getText());*/
	
	System.out.println(s.isMultiple());// true/false
	
	/*List<WebElement> l = s.getOptions(); //return all the option of list box
	
	System.out.println(l.size()); //count of the option
	
	for (int i=0; i<l.size(); i++) {
		
		System.out.println(l.get(i).getText());
	}*/
	
	// FOR EACH LOOP :-
	List<WebElement> l = s.getOptions();
	for (WebElement w : l) {
		
		System.out.println(w.getText());
	}
	
  
	
	
}
}
