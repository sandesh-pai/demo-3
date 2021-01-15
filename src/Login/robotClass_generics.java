package Login;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;





public class robotClass_generics {
	
	Robot r;
	
	public robotClass_generics() throws AWTException
	{
		r = new Robot();
	   
	}

	
	public void m()
	{
		r.keyPress(KeyEvent.VK_T);
	}
	

}
