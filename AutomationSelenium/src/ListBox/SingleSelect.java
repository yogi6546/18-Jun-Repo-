package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	Thread.sleep(2000);
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));//locate the list box
    
    Select s = new Select (month);//Create object of select class
    Thread.sleep(3000);
    s.selectByIndex(2);//march
    Thread.sleep(3000);
    s.selectByValue("5");//may
    Thread.sleep(3000);
    s.selectByVisibleText("Aug");//Aug
    
    // FOR EACH LOOP :-
    List<WebElement> l = s.getOptions();
    ArrayList <String> ar = new ArrayList <String> ();
    for (WebElement w : l) {
    	
    	System.out.println(w.getText());
    	
    	ar.add(w.getText());
    }
    Collections.sort(ar);
   
    for (String s1 :ar) { //Ascending
    	System.out.println(s1);
    }
    
    for (int i=ar.size()-1; i>=0; i--) { //Descending 
    	
    	System.out.println(ar.get(i));
    }
}
}
