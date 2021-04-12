package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Login']")
	WebElement lnkLogin;
	
	public void ClickLogin()
	{
		lnkLogin.click();
	}
}
