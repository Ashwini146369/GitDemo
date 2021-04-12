package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{

	@FindBy(how=How.XPATH,using="//input[@id='user_email']")
	WebElement UserName;
	@FindBy(how=How.XPATH,using="//input[@id='user_password']")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//input[@name='commit']")
	WebElement 	btnLogin;
	
	public void EnterCredential(String Uname, String Password)
	{
		UserName.sendKeys(Uname);
		this.Password.sendKeys(Password);
		btnLogin.click();
	}
	
}
