package unitTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.TestBaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC03 extends TestBaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void PreReq() {
		driver = DriverInitialization();
		//System.out.println("Before Method Called");
	}

	@AfterMethod
	public void PostReq() {
		driver.quit();
		//System.out.println("After Method Called");
	}

	@Test
	public void LaunchApplication() {
		driver.get(prop.getProperty("URL"));
	}

	@Test
	public void NavigateToLoginPage() {
		driver.get(prop.getProperty("URL"));
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
	}

	@Test
	public void EnterLoginCredential() {
		driver.get(prop.getProperty("URL"));
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
		LoginPage LP = PageFactory.initElements(driver, LoginPage.class);
		LP.EnterCredential("Admin", "Admin123");
	}

	@Test
	public void VerifyHomePageTitle() {
		driver.get(prop.getProperty("URL"));
		String HPTitle = driver.getTitle();
		Assert.assertEquals(HPTitle,"QA1 Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");

	}

	@Test
	public void VerifyLoginPageTitle() {
		driver.get(prop.getProperty("URL"));
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
		String LPTitle = driver.getTitle();
		Assert.assertEquals(LPTitle, "WebServices Testing using SoapUI");
	}
}
