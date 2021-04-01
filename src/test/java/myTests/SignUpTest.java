package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.UUID;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;

public class SignUpTest extends BaseTest {

	@Test (groups = { "regression", "sign_up" })
	public void signUp() throws InterruptedException {
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

}
