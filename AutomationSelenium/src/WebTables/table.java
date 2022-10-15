package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver ();//launch browser
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	
	
	System.out.println(rows.size());
	
	
	List<WebElement> headercell = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
	
	List<WebElement> remainingcell = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
	
	System.out.println(headercell.size()+remainingcell.size());
	
	/*for (WebElement cell : headercell) {
		System.out.println(cell.getText());
	}
	
	
	for (WebElement cell : remainingcell) {
		System.out.println(cell.getText());
	}*/
	
	for (int i=0; i<headercell.size(); i++) {
		System.out.println(headercell.get(i).getText());
	}
	
	for (int i=0; i<remainingcell.size(); i++) {
		System.out.println(remainingcell.get(i).getText());
	}
	
	
	
}
}
