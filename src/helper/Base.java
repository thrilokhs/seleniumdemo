package helper;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageObjects.AppleLogin;

public class Base {

	public static AppleLogin al = new AppleLogin();
	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver initializeDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "//Users//t.somashekar//Desktop//PER//Work//chromedriver");
		driver = new ChromeDriver();
		// driver =initializeDriver();
		driver.navigate().to("https://www.apple.com/be/");

		return driver;
	}

	@BeforeClass
	public static void login() throws Exception {
		al.Login();
	}

	@AfterClass
	public static void logout() throws Exception {
		al.Logout();;
	}

	@AfterSuite
	public static void closeBrowser() {
		driver.close();
	}
}
