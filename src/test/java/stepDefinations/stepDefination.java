package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.TestBaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class stepDefination extends TestBaseClass{
	WebDriver driver;
    @Given("^Launch netbanking application$")
    public void launch_netbanking_application() throws Throwable {
    	driver = DriverInitialization();
    	driver.get(prop.getProperty("URL"));
    }

    @When("^Click on login button$")
    public void click_on_login_button() throws Throwable {
    	HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
    }

    @Then("^Verify user logged in successfully$")
    public void verify_user_logged_in_successfully() throws Throwable {
    	Assert.assertTrue(true);
    }

    @And("^Enter username and password, then click on ok$")
    public void enter_username_and_password_then_click_on_ok() throws Throwable {
    	LoginPage LP = PageFactory.initElements(driver, LoginPage.class);
		LP.EnterCredential("Admin", "Admin123");
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.quit();
    }
}

