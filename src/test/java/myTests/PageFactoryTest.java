package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.UUID;
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
		String email = UUID.randomUUID().toString() + "@example.com";
		authPage.enterRegisterEmail(email);

		//Click create an account button
		authPage.clickCreateAnAccountButton();

		//Enter create account email
		createAccountPage.enterFirstName("Myriam");

		//Enter create account email
		createAccountPage.enterLastName("Benavides");

		//Enter create account email
		createAccountPage.enterPassword("Pass123");

		//Enter create account email
		createAccountPage.enterAddress("Academy 2021");

		//Enter create account email
		createAccountPage.enterCity("Monterrey");

		//Enter create account email
		createAccountPage.enterId_state("5");

		//Enter create account email
		createAccountPage.enterPostcode("66220");

		//Enter create account email
		createAccountPage.enterId_country("2");

		//Enter create account email
		createAccountPage.enterPhone_mobile("8110316631");

		//Click create an account button
		createAccountPage.clickRegisterButton();

	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
