package myTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class SignInTest {

	WebDriver driver;

	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/resources/" + ( System.getProperty("os.name").toLowerCase().contains("mac") ? "chromedriver" : "chromedriver.exe" ));
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	

	@Test
	public void signIn()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);

		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		assertEquals("Authentication failed", "http://automationpractice.com/index.php?controller=my-account", driver.getCurrentUrl().toString());
		
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
