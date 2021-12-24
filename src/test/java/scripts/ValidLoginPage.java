
package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ETTpage;
import pages.Loginpage;

public class ValidLoginPage extends BaseTest {
	
	@Test(priority = 1,groups="smoke")
	public void testValidLogin() {
//	    1. Enter Valid User Name
		Loginpage loginPage=new Loginpage(driver);
		loginPage.setUserName("admin");
//	    2. Enter Valid Password
		loginPage.setPassword("manager");
//	    3. click on login button
		loginPage.clickLoginButton();
//	    4. Verify that Home Page is Displayed
		ETTpage ettPage=new ETTpage(driver);
		boolean result = ettPage.verifyWelcomeIsDisplayed(wait);
		Assert.assertTrue(result,"Home Page is not displayed");
	}

}
