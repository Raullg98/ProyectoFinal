package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyWishlistPage;

public class CreateWishlistTest extends BaseTest {

    @Test (groups = { "regression", "create_wishlist" })
	public void createWishlist()  throws InterruptedException {

		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		MyAccountPage accountPage = PageFactory.initElements(driver, MyAccountPage.class);
		MyWishlistPage wishlistPage = PageFactory.initElements(driver, MyWishlistPage.class);

		// Sign In
		mainPage.openSignInPage();
		authenticationPage.signIn("testing1@gmail.com", "equipo4");

		// Open Wishlist page
		accountPage.openMyWishlistPage();

		// Create new Wishlist
		wishlistPage.createWishlist("A Wishlist Test");
		
	}
    
}
