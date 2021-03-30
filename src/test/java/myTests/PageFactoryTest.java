package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class PageFactoryTest {

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
	public void searchDresses() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.searchClothes("dress");
	}

	@Test
	public void fillNameAndLastName() throws InterruptedException {
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);
		CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);

		//Click sign in button
		mainPage.openSignInPage();

		//Enter create account email
		authPage.enterRegisterEmail("john@doe.com");

		//Click create an account button
		authPage.clickCreateAnAccountButton();

		//Enter create account email
		createAccountPage.enterFirstName("Raul");

		//Enter create account email
		createAccountPage.enterLastName("Lara");



	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
