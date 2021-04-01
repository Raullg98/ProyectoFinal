package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;
import pages.PO;

public class ProductOverviewTest extends BaseTest {

	@Test (groups = { "regression", "product_overview" })
	public void productOverview()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		
		PO op = PageFactory.initElements(driver, PO.class);

		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		
		//Overview product test
		mainPage.goHome();
		
		op.selectProduct();
		op.reviewButton();
		op.commentProduct("Comment1", "I didn't like the product, it was damage!!!");
		op.sendComment();
		op.confirmComment();
	
	}
	
}
