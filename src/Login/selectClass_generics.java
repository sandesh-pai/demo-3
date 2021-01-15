package Login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectClass_generics {
	
	 public Select s;
	 
	public selectClass_generics (WebElement element)
			{
		         s = new Select(element);
		    }
	
	public void deselectByIndex(int x)
	{
		s.deselectByIndex(x);
	}
	
	public void deselectbyvalue(String x)
	{
	      s.deselectByValue(x);
	}
	public void deselectbyText(String x)
	{
	      s.deselectByVisibleText(x);
	}
	
	public void selectByIndex(int x)
	{
		s.selectByIndex(x);
	}
	
	public void selectbyvalue(String x)
	{
	      s.selectByValue(x);
	}
	public void selectbyText(String x)
	{
	    s.selectByVisibleText(x);
	}
	
	public List<WebElement>  getAll()
	{
		return s.getOptions();
	}
	
	public void deselectall()
	{
		s.deselectAll();
	}
	
	public WebElement getFirst()
	{
		return s.getFirstSelectedOption();
	}
	
	
	public boolean isMulti()
	{
	  return s.isMultiple();
	}
	
	public List<WebElement> getAllSelected()
	{
		return s.getAllSelectedOptions();
	}
	
	

}
