package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/resources/" + ( System.getProperty("os.name").toLowerCase().contains("mac") ? "chromedriver" : "chromedriver.exe" ));
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

    @AfterMethod(alwaysRun = true)
	public void endSession() {
		driver.quit();
	}

}
