package unitTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import config.TestBaseClass;
import pageObjects.HomePage;

public class TC02 extends TestBaseClass
{	
	WebDriver driver;
	@Test
	public void LaunchApp2()
	{
		driver = DriverInitialization();
		driver.get(prop.getProperty("URL"));
		
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
		driver.quit();
	}
}
