package myTests;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;

public class SignInTest extends BaseTest {

	@Test (groups = { "regression", "sign_in" })
	public void signIn()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);

		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		assertEquals("Authentication failed", "http://automationpractice.com/index.php?controller=my-account", driver.getCurrentUrl().toString());
		
	}
}
