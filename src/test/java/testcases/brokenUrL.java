package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenUrL {
	
	@Test
	public void checkBrokenLinks() throws IOException
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.theworldsworstwebsiteever.com/");
        
       List<WebElement> listsOFLinks = driver.findElements(By.xpath("//a"));
       Set<String> list_of_broken = new HashSet<String>();
       for (WebElement link : listsOFLinks) {
		      String linkurl = link.getAttribute("href");
		      
		    
			try {
				  URL url = new URL(linkurl);
				URLConnection connectToURL = url.openConnection();
				   
			      HttpURLConnection httpurl =  (HttpURLConnection) connectToURL;
			      httpurl.setConnectTimeout(5000);
			      httpurl.connect();
			      
			      if (httpurl.getResponseCode() != 200) {
			    	  list_of_broken.add(linkurl);
			    	  System.out.println(linkurl + "-" + httpurl.getResponseCode() + "- " + httpurl.getResponseMessage());
			      }
			      httpurl.disconnect(); 
		
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
       System.out.println(list_of_broken);
	}
	

	
	
	

}
