package org.stepDefinations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.applicationHooks.AppHooks;
import org.factory.DriverFactory;
import org.pages.LoginPage;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	LoginPage lpObj;

	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {//Every thing should be open here
//		BaseUtility bu=new BaseUtility();
//		WebDriver driver=bu.startup("ch", "http://localhost:90/login.do");
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lpObj=new LoginPage(DriverFactory.getDriver());
	}

	@Then("user name field is displayed")
	public void user_name_field_is_displayed() throws EncryptedDocumentException, IOException {
		
		Assert.assertTrue(lpObj.isUserNameDisplay());
		AppHooks.scn.log("User name field is displayed");
//		System.out.println("Data from excel file : "+AppHooks.exUtility.getSpecificValue(1,2 , "NAMESHEET1"));
		
	}

	@Then("Password field is displayed")
	public void password_field_is_displayed() {
		Assert.assertTrue(lpObj.isPassWordFieldDisplay()) ;
		AppHooks.scn.log("Password field is displayed");


	}

	@Then("Login button is displayed")
	public void login_button_is_displayed() {
		Assert.assertTrue(lpObj.isLoginBtnDisplay()) ;
		AppHooks.scn.log("Login button field is displayed");

	}

	@When("user enters username")
	public void user_enters_username() {
		lpObj.enterUserName();
		AppHooks.scn.log("User name entered");

	}

	@When("user enters password")
	public void user_enters_password() {
		lpObj.enterPassword();
		AppHooks.scn.log("Password  entered");

	}

	@When("user clicks on login botton")
	public void user_clicks_on_login_botton() throws InterruptedException {
		lpObj.clickOnLoginButton();
		AppHooks.scn.log("Clicked on login button");

	}

	@Then("Dashborad title is {string}")
	public void dashborad_title_is(String exptitle) {
		Assert.assertEquals(lpObj.getDashboardTitle(),exptitle);

	}
//	@When("User enters {string}")
//	public void user_enters(String string) {
//		
//	}
//
//	@When("Clicks on login button")
//	public void clicks_on_login_button() {
//		
//	}
//
//	@Then("Title Should be {string}")
//	public void title_should_be(String string) {
//}

}
