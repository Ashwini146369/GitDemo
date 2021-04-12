package unitTestCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.TestBaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC04 extends TestBaseClass {
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
	public void LoginThrough_Database() throws SQLException {
		driver.get(prop.getProperty("URL"));
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
		HP.ClickLogin();
		String host = "localhost";
		String port = "3306";
		String url = "jdbc:mysql://"+host+":"+port+"/qadbt";
		
		Connection conn = DriverManager.getConnection(url, "root", "Bholenath123");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from hdfcbank where usertype='ppfbal'");
		LoginPage LP = PageFactory.initElements(driver, LoginPage.class);
		while(rs.next())
		{
			LP.EnterCredential(rs.getString("username"), rs.getString("password"));
		}
		conn.close();
	}
}
