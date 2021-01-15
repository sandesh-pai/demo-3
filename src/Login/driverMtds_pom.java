package Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverMtds_pom {
	
	
	
	 public String getTitle(WebDriver driver)
  {
	  return driver.getTitle();
  }

	public void openBrowser(WebDriver driver, String baseUrl)
	{
	   driver.get(baseUrl);
	}
	
	public String getParentWindow(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	public Set<String> getWindows(WebDriver driver)
	{
		return driver.getWindowHandles();
	}
	
	
	public void alertAccept(WebDriver driver)
	{
	    Alert alert = driver.switchTo().alert();
	    
	    alert.accept();
	}
	
	
	public void clickbtnJse(WebDriver driver, WebElement element)
	{
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		element.click();
	}
	
	
	  public void clickbtnJseEXPECTION(WebDriver driver, WebElement element)
	  { 
		 
	  try {
		          element.click();   
		
	} catch (Exception e) {
		
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 js.executeScript("arguments[0].click()", element);
		
	}
	 
	 
	  }
	 
	
	public void midclickEXCEPTION(WebDriver driver, WebElement element)
	{
		
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
		  	  wait.until(ExpectedConditions.visibilityOf(element)).click();
			
		} catch (WebDriverException e) {
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		

	}
	
	
	  public void clickbtn(WebDriver driver,WebElement element) throws
	  InterruptedException 
	  {
		  WebDriverWait wait = new WebDriverWait(driver, 10);
	  	  wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	
	  
	  }
	 
	  public void alertdismiss(WebDriver driver)
	  {
		  Alert alert = driver.switchTo().alert();
		    
		    alert.dismiss();
	  }
	 
	  
	
	 
	public void Timewait(WebDriver driver, int i)
	{
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	
	public void xpath(WebDriver driver, String xpath)
	{
		driver.findElement(By.xpath(xpath));
	}
	
	
	public void send(WebDriver driver,WebElement element, String text, int timeout)
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	public String geText(WebDriver driver, WebElement element)
	{
		return element.getText();
	}
	
	
	public void listDropdown(WebDriver driver, String xpath, String data)
	{

		List<WebElement> element = driver.findElements(By.xpath(xpath));
		
		for(WebElement ele  : element)
		{
			String sTEXT = ele.getText();
			if(sTEXT.equalsIgnoreCase(data))
			{
				ele.click();
				break;
			}
			
		}
	}
	
	public void listDropdownSize(WebDriver driver, String xpath)
	{
		List<WebElement> element = driver.findElements(By.xpath(xpath));
		System.out.println(element.size());
	}
	
	 public String getCellData(String path, String sheetName, int rowNumber, int
			  cellNumnber) throws EncryptedDocumentException, InvalidFormatException,
			  IOException
			  { 
				  FileInputStream filePath = new FileInputStream(path);
			
			  return
			  WorkbookFactory.create(filePath).getSheet(sheetName).getRow(rowNumber).
			  getCell(cellNumnber).toString();
			  
			  }
	 
	 public void switchToTabNo(WebDriver driver, int id)
		{
			
			Set<String> childWindows = driver.getWindowHandles();
			ArrayList<String> windowLists = new ArrayList<String>(childWindows);
			   driver.switchTo().window(windowLists.get(id));
		}
	 
	 
	 public void takesnapshot(String path, WebDriver driver) throws IOException
		{
			Date d  = new Date();
			String date = d.toString().replace(":", "-");
			
			TakesScreenshot tss = (TakesScreenshot) driver;
			
		File src = tss.getScreenshotAs(OutputType.FILE);
		
		File dsc = new File( path + date + ".jpeg");
		
		      FileUtils.copyFile(src, dsc);
	 
		}
	 
	 
	 public void scrollintoElement(WebDriver driver)
	 {
		 
		 WebElement element = driver.findElement(By.xpath("//a[.='Test new features']"));
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("arguments[0].scrollIntoView(true)", element);
		  
	 }

}
