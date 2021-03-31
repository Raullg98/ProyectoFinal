package myTests;

import static org.junit.Assert.assertEquals;

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
import pages.MyAccountPage;
import pages.MyAddressPage;
import pages.YourAddressPage;

public class AddNewAddressTest {
    
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
    public void  AddNewAddress()  throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		MyAccountPage myaccountPage= PageFactory.initElements(driver, MyAccountPage.class);
		MyAddressPage myaddressPage= PageFactory.initElements(driver, MyAddressPage.class);
		YourAddressPage youraddressPage= PageFactory.initElements(driver,YourAddressPage.class);

        mainPage.openSignInPage();

		//Action to sig in 
        authenticationPage.signIn("testing1@gmail.com", "equipo4");
        //click on section of user name 
		mainPage.userName();
		//Click on button my address
		myaccountPage.clickOnMyAddress();
		//Click on button my new address 
		myaddressPage.clickOnMyNewAddress();
		// input address
		youraddressPage.InputAddNewAddress("Colonia Bonita");
		// input city
		youraddressPage.InputAddCity("Chihuahua");
		// input state
		youraddressPage.InputAddState("2");
		// input zip code 
		youraddressPage.InputZipCode("11123");
		// input home phone
		youraddressPage.InputHomePhone("61452187923");
		// var to save name of the direccion 
		String direccion = "Direccion_"+ (int) (Math.random() * 10000);
		// input to put save alias 
		youraddressPage.InputToSaveAlias(direccion);
		// click button save
		youraddressPage.ClickonSubmitNewAddress();

    }

    @AfterTest
	public void endSession() {
		driver.quit();
	}
}
