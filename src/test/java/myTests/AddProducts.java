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
import pages.SearchPage;

public class AddProducts {

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
	public void AddProduct()  throws InterruptedException {
//The values that you need to do the Test
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
//Call MainPage the public openSignInPage
		mainPage.openSignInPage();
//Call AuthenticationPage the public signIn:
		authenticationPage.signIn("testing1@gmail.com", "equipo4");
//Call MainPage the public goHome
        mainPage.searchClothes("Blouse");
//Call MainPage the public openProduct:
        searchPage.openProduct();
//Call MainPage the public addCart:
        mainPage.AddCart();
//Call MainPage the public ViewmyCart:
        mainPage.Cart();
	}



	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
