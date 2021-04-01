package myTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MainPage;


public class SignOutTest extends BaseTest{

    @Test (groups = { "regression", "sign_out" })
    public void signOut()  throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        AuthenticationPage authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
        mainPage.openSignInPage();
        authenticationPage.signIn("testing1@gmail.com", "equipo4");
		//sign out 
        mainPage.SignOutInPage();
    }
    
}
