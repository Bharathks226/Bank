package Bank.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Bank.pageObject.LoginPage;

public class TC_LoginTest_001 extends Baseclass {
	
	@Test
	public void liginTest() throws InterruptedException
	{
		driver.get(baseURL);
		
		logger.info("URL Opned");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		Thread.sleep(10);
		logger.info("username Opned");
		lp.setpassword(password);
		logger.info("password Opned");
		lp.clickSubmit();
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"));
		{
			Assert.assertTrue(true);
			
		}
			
	}

}
