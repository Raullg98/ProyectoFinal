package myTests;
import static org.junit.Assert.assertEquals;

import java.util.UUID;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MainPage;

public class NewsletterTest extends BaseTest {

	@Test (groups = { "regression", "sign_up_newsletter" })
	public void signUpForNewsletter() throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		String email = UUID.randomUUID().toString() + "@example.com";
		mainPage.signUpForNewsletter(email);
		assertEquals("An successful message was expected.", "Newsletter : You have successfully subscribed to this newsletter.", mainPage.getAlertMessage());

	}
	
}
