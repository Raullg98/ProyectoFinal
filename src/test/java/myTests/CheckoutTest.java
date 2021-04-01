package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AddressCheckoutPage;
import pages.AuthenticationPage;
import pages.MainPage;
import pages.PaymentCheckoutPage;
import pages.SearchPage;
import pages.ShippingCheckoutPage;
import pages.SummaryCheckoutPage;

public class CheckoutTest extends BaseTest {


	@Test (groups = { "regression", "checkout" })
	public void checkOutFlowByBankWire() throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		SummaryCheckoutPage summaryCheckoutPage = PageFactory.initElements(driver, SummaryCheckoutPage.class);
		AddressCheckoutPage addressCheckoutPage = PageFactory.initElements(driver, AddressCheckoutPage.class);
		ShippingCheckoutPage shippingCheckoutPage = PageFactory.initElements(driver, ShippingCheckoutPage.class);
		PaymentCheckoutPage paymentCheckoutPage = PageFactory.initElements(driver, PaymentCheckoutPage.class);
		


		mainPage.openSignInPage();
		
		authenticationPage.signIn("testing1@gmail.com", "equipo4");
		
        mainPage.searchClothes("Blouse");
		
        searchPage.openProduct();
		
        mainPage.AddCart();

        mainPage.Cart();

		summaryCheckoutPage.clickProceedToCheckoutButton();

		addressCheckoutPage.clickProceedToCheckoutButton();

		shippingCheckoutPage.checkTermsOfServiceCheckbox();

		shippingCheckoutPage.clickProceedToCheckoutButton();

		paymentCheckoutPage.clickPayByBankWireButton();

		paymentCheckoutPage.clickConfirmMyOrderButton();
		


	}

}
