package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



	
	public class loginpage {

		   
		@FindBy(xpath = "//input[@id='username']")
		private WebElement usrtbx;
		
		@FindBy(name="pwd")
		private WebElement pwdtbx;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement lgbtn;
		
		
		public loginpage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		
		public void userName(String s)
		{
			usrtbx.sendKeys(s);
		}
		
		public void pwd(String s)
		{
		    pwdtbx.sendKeys(s);
		}
		
	    public void lgclick()
	    {
	    	lgbtn.click();
	    }
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


