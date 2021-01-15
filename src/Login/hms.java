package Login;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class hms extends driverMtds {

	WebDriver driver;

	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\drivers\\geckodriver.exe");
		hms hm = new hms();

		driver = new FirefoxDriver();
              driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		hm.openBrowser(driver, "http://localhost:8080/login.do;jsessionid=1lbi8u5foj1rg");
		//driver.findElement(By.xpath("//button[.='✕']")).click();
            
	}

	@Test
	public void OpenApp() throws IOException, InterruptedException {
		
		hms hm = new hms();
		hm.send(driver, "//input[@id='username']", "admin", 10);
	
		
		
		
		
	}

}
