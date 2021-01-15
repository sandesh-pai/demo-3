package Login;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionClass_generics {
	
	Actions a;
	
	public actionClass_generics(WebDriver driver)
	{
		a = new Actions(driver);
		
	}
	
	public void mousehover(WebElement element)
	{
		a.moveToElement(element).perform();
	}
	
	
	public void doubleClick(WebElement element)
	{
		a.contextClick(element).perform();
	}
	
	public void doubleClick()
	{
		a.contextClick().perform();
	}
	
	public void doubleclick()
	{
		a.doubleClick().perform();
	}
	
	
	public void dragdrop(WebElement source, WebElement target)
	{
		a.dragAndDrop(source, target).perform();
	}
	
	public void moveToElement(WebElement element)
	{
		a.moveToElement(element).contextClick().perform();
	}
	
	
	

}
