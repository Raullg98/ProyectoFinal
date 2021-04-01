package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;
import pages.SearchPage;

public class AddProductsTest extends BaseTest {

	@Test (groups = { "regression", "add_product" })
	public void AddProduct()  throws InterruptedException {
		//The values that you need to do the Test
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		//Call MainPage the public openSignInPage
		mainPage.openSignInPage();
		//Call AuthenticationPage the public signIn:
		authenticationPage.signIn("testing1@gmail.com", "equipo4");
		//Call MainPage the public goHome
        mainPage.searchClothes("Blouse");
		//Call MainPage the public openProduct:
        searchPage.openProduct();
		//Call MainPage the public addCart:
        mainPage.AddCart();
		//Call MainPage the public ViewmyCart:
        mainPage.Cart();
	}

}
