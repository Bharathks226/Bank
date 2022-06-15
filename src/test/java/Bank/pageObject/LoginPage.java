package Bank.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy (name="uid")
	WebElement txtusername;
	
	@FindBy (name="password")
	WebElement txtpassword;
	
	@FindBy (name="btnLogin")
	WebElement txtlogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	public void setUserName(String name)
	{
		txtusername.sendKeys(name);
	}
	
	
	
	
	public void setpassword(String pass1)
	{
		txtpassword.sendKeys(pass1);
	}
	
	public void clickSubmit()
	{
		txtlogin.click();
	}




	public void clickLogout() {
		
		lnkLogout.click();
		// TODO Auto-generated method stub
		
	}


}
	
	

