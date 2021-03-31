package myTests;
import static org.junit.Assert.assertEquals;

import java.util.UUID;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

public class NewsletterTest {

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
	public void signUpForNewsletter() throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		String email = UUID.randomUUID().toString() + "@example.com";
		mainPage.signUpForNewsletter(email);
		assertEquals("An successful message was expected.", "Newsletter : You have successfully subscribed to this newsletter.", mainPage.getAlertMessage());

	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
