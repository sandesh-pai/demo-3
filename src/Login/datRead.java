package Login;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class datRead extends driverMtds{


	
	

	@Test
	public void upload() throws InterruptedException, IOException
	{
		
		datRead dr = new datRead();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		dr.openBrowser(driver, "http://localhost:8080/login.do");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("./screenshot/.png");
		FileUtils.copyFile(src, dst);
		
	  
       
	}
}
	
	
	/*
	 * public void keyboardEvent(WebDriver driver, String xpath, int key) throws
	 * AWTException{ Robot r = new Robot(); WebElement element =
	 * driver.findElement(By.xpath(xpath)); Actions act = new Actions(driver);
	 * act.moveToElement(element).contextClick(element).perform(); r.keyPress(key);
	 * r.keyRelease(key); }
	 * 
	 * 
	 * public void midclickEXCEPTIONs(WebDriver driver, String x) {
	 * 
	 * 
	 * try { WebElement element = driver.findElement(By.xpath(x)); Actions act = new
	 * Actions(driver); act.moveToElement(element).click().build().perform();
	 * 
	 * } catch (WebDriverException e) {
	 * 
	 * }
	 * 
	 * // act.moveToElement(driver.findElement(By.xpath(x))).doubleClick().build().
	 * perform(); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */