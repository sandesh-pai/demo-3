package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Generics {

	public WebDriver driver;
	
	
	@BeforeMethod
	public void openApp() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
		
		
	     
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
