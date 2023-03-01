package org.stepDefinations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.applicationHooks.AppHooks;
import org.factory.DriverFactory;
import org.junit.Assert;
import org.pages.Lets_be_FriendsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lets_be_FriendsStepDef {
	Lets_be_FriendsPage lfObj;

	@Given("user is on main page")
	public void user_is_on_main_page() {

		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url1"));
		 lfObj=new Lets_be_FriendsPage(DriverFactory.getDriver());
		 

	}
	@Then("name and email field should be present")
	public void name_and_email_field_should_be_present() {
		Assert.assertTrue(lfObj.isEmailFieldPresent());
	}

	@When("User enters name and email")
	public void user_enters_name_and_email() throws EncryptedDocumentException, IOException {
		lfObj.enterNameAndEmail();
	}

	@When("user clicks on next section button then next page should be opened")
	public void user_clicks_on_next_section_button_then_next_page_should_be_opened() {
		lfObj.clickOnOkBtn();
	}

	@Then("{int} radio buttons should be present")
	public void radio_buttons_should_be_present(int radioButtons) {
		Assert.assertEquals(radioButtons, lfObj.getRadioButtons());
		
	}

	@When("user selects l like ps4 radio button")
	public void user_selects_l_like_ps4_radio_button() {
		lfObj.selectPS4();
		
	}

	@When("click on next section new section should be opened")
	public void click_on_next_section_new_section_should_be_opened() {
		lfObj.clickOnb2();
		
	}

	@Then("Ok button should be present")
	public void ok_button_should_be_present() {
		lfObj.isPaymeytButtonPresent();
		
	}

	@When("user clicks on ok button")
	public void user_clicks_on_ok_button() {
		lfObj.clickOnPaymentBtn();
	}

	@Then("one Pop-up should should show text {string}")
	public void one_pop_up_should_should_show_text(String msg) {
		Assert.assertEquals(msg, lfObj.getPopUpMsg());
		
	}
}
