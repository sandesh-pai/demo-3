package testcases;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formfiling {
	
	
	
	@Test
	public void form(Method m) throws IOException, InterruptedException
	{
		String testcaseName = m.getName();
		WebDriverManager.chromedriver().setup();
	WebDriver browser = new ChromeDriver();
	browser.get("https://webdriveruniversity.com/");
	browser.manage().window().maximize();
	  String parentWindowhandle = browser.getWindowHandle();
	browser.findElement(By.xpath("//h1[.='BUTTON CLICKS']")).click();
    Thread.sleep(1000);
   Set<String> windows = browser.getWindowHandles();
  for (String string : windows) {
	if (!parentWindowhandle.equalsIgnoreCase(string)) {
	    browser.switchTo().window(string);
	    Thread.sleep(1000);
	    browser.findElement(By.xpath("//span[@id='button1']")).click();
	    Thread.sleep(1000);
	    getScreenShot(browser,testcaseName);
	    browser.close();
	}
}
  browser.switchTo().window(parentWindowhandle);
  browser.findElement(By.xpath("//h1[.='BUTTON CLICKS']")).click();
  Thread.sleep(1000);
 Set<String> w2 = browser.getWindowHandles();
 for (String string : w2) {
	if (!parentWindowhandle.equalsIgnoreCase(string)) {
		browser.switchTo().window(string);
		WebElement ele = browser.findElement(By.xpath("//span[@id='button2']"));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		jse.executeScript("arguments[0].click();", ele);
	    Thread.sleep(1000);
		getScreenShot(browser,testcaseName);
        jse.executeScript("arguments[0].click();",browser.findElement(By.xpath("(//button[.='Close'])[1]")));
		browser.close();
	}
}
 
 browser.switchTo().window(parentWindowhandle);
 browser.findElement(By.xpath("//h1[.='BUTTON CLICKS']")).click();
 Thread.sleep(1000);
  
  //3rd
         Set<String> w3 = browser.getWindowHandles();
         Iterator<String> itr = w3.iterator();
         while (itr.hasNext()) {
        	     String str = itr.next();
			if (!parentWindowhandle.equalsIgnoreCase(str)) {
				browser.switchTo().window(str);
				browser.findElement(By.xpath("//span[@id='button3']")).click();
			    Thread.sleep(1000);
				getScreenShot(browser, testcaseName);
				Actions act3 = new Actions(browser);
				act3.click().build().perform();
				browser.close();
			}
			
		}
         browser.switchTo().window(parentWindowhandle);
		 browser.quit();
	}
	
	
	
	public void  getScreenShot(WebDriver driver,String name) throws IOException
	{
		deleteDirectory(new File("./screenshots/"));
		TakesScreenshot tks = (TakesScreenshot) driver;
		File file = tks.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String d1 = d.toString().replace(":", "-");
		FileUtils.copyFile(file, new File("./screenshots/"+name+ d1+ ".png"));
	}
	
	
	 public static void deleteDirectory(File file)
	    {
	        // store all the paths of files and folders present
	        // inside directory
	        for (File subfile : file.listFiles()) {
	  
	            // if it is a subfolder,e.g Rohan and Ritik,
	            // recursiley call function to empty subfolder
	            if (subfile.isDirectory()) {
	                deleteDirectory(subfile);
	            }
	  
	            // delete files and empty subfolders
	            subfile.delete();
	        }
	    }

}
