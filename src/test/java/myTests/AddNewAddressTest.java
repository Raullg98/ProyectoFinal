package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyAddressPage;
import pages.YourAddressPage;

public class AddNewAddressTest extends BaseTest {
    
    @Test (groups = { "regression", "add_new_address" })
    public void  AddNewAddress()  throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
		MyAccountPage myaccountPage= PageFactory.initElements(driver, MyAccountPage.class);
		MyAddressPage myaddressPage= PageFactory.initElements(driver, MyAddressPage.class);
		YourAddressPage youraddressPage= PageFactory.initElements(driver,YourAddressPage.class);

        mainPage.openSignInPage();

		//Action to sig in 
        authenticationPage.signIn("testing1@gmail.com", "equipo4");
        //click on section of user name 
		mainPage.userName();
		//Click on button my address
		myaccountPage.clickOnMyAddress();
		//Click on button my new address 
		myaddressPage.clickOnMyNewAddress();
		// input address
		youraddressPage.InputAddNewAddress("Colonia Bonita");
		// input city
		youraddressPage.InputAddCity("Chihuahua");
		// input state
		youraddressPage.InputAddState("2");
		// input zip code 
		youraddressPage.InputZipCode("11123");
		// input home phone
		youraddressPage.InputHomePhone("61452187923");
		// var to save name of the direccion 
		String direccion = "Direccion_"+ (int) (Math.random() * 10000);
		// input to put save alias 
		youraddressPage.InputToSaveAlias(direccion);
		// click button save
		youraddressPage.ClickonSubmitNewAddress();

    }

}
