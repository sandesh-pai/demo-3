package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPAGE extends driverMtds{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = ("http://localhost:8080/login.do");
		
		loginPAGE lp = new loginPAGE();
		lp.openBrowser(driver, baseUrl);
		String title = lp.getTitle(driver);
		System.out.println(title);
		lp.Timewait(driver, 10);
		
		lp.send(driver, "//input[@id='username']", "admin", 10);
		lp.send(driver, "//input[@type='password']", "manager", 10);
	     lp.clickbtn(driver, "//div[.='Login ']");

			
			  lp.clickbtnJseEXPECTION(driver, "//div[.='TASKS']");
			  
			 
			lp.clickbtnJseEXPECTION(driver, "//div[.='Add New Task']");
			lp.clickbtnJseEXPECTION(driver, "//div[contains(@class,'createNew')]");
			
			
			
	
			lp.clickbtnJseEXPECTION(driver, "//button[.='Our Company']");
			lp.listDropdown(driver, "//li[contains(@id,'ext')]", "Architects Bureau");
			
			lp.clickbtnJseEXPECTION(driver, "//img[@class='infoIconImg']");
		
		
	   
	    
	}

}
