package mock_3;

import org.testng.annotations.Test;

import Login.Generics;
import Login.driverMtds;
import pom.loginpage;

public class login extends Generics {
	
	@Test(priority=1)
	public void homepage() throws InterruptedException
	{
		
		loginpage lp = new loginpage(driver);
		lp.userName("admin");
		lp.pwd("manager");
		lp.lgclick();
		
		
	  
	}

		
	}
	


