
package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MainPage;

public class ShowProducts extends BaseTest {

	@Test (groups = { "regression", "show_products" })
	public void showProducts()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

        mainPage.show();
        mainPage.goHome();
        mainPage.show2();
    }
	
}