package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyWishlistPage;

public class CreateWishlistTest {

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
	public void createWishlist()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		MyAccountPage accountPage = PageFactory.initElements(driver, MyAccountPage.class);
		MyWishlistPage wishlistPage = PageFactory.initElements(driver, MyWishlistPage.class);

		// Sign In
		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		// Open Wishlist page
		accountPage.openMyWishlistPage();

		// Create new Wishlist
		wishlistPage.createWishlist("A Wishlist Test");
		
	}

    @AfterTest
	public void endSession() {
		driver.quit();
	}
    
}
