package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddressCheckoutPage;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;
import pages.PaymentCheckoutPage;
import pages.ShippingCheckoutPage;
import pages.SummaryCheckoutPage;

public class CheckoutTest {

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
	public void checkOutFlowByBankWire() throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		SummaryCheckoutPage summaryCheckoutPage = PageFactory.initElements(driver, SummaryCheckoutPage.class);
		AddressCheckoutPage addressCheckoutPage = PageFactory.initElements(driver, AddressCheckoutPage.class);
		ShippingCheckoutPage shippingCheckoutPage = PageFactory.initElements(driver, ShippingCheckoutPage.class);
		PaymentCheckoutPage paymentCheckoutPage = PageFactory.initElements(driver, PaymentCheckoutPage.class);
		

		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		Thread.sleep(8000);

		mainPage.openCartPage();
		summaryCheckoutPage.clickProceedToCheckoutButton();

		addressCheckoutPage.clickProceedToCheckoutButton();

		shippingCheckoutPage.checkTermsOfServiceCheckbox();

		shippingCheckoutPage.clickProceedToCheckoutButton();

		paymentCheckoutPage.clickPayByBankWireButton();

		paymentCheckoutPage.clickConfirmMyOrderButton();
		


	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
