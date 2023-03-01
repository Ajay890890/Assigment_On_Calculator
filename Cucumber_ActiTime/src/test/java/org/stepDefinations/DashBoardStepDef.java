package org.stepDefinations;

import java.io.UnsupportedEncodingException;

import org.applicationHooks.AppHooks;
import org.factory.DriverFactory;
import org.pages.DashBordPage;
import org.pages.LoginPage;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class DashBoardStepDef {
	private LoginPage lpObj;
	private DashBordPage dpObj;

	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application() throws UnsupportedEncodingException, InterruptedException {
		//		DataTable credTable
		//		List<Map<String,String>> creList=credTable.asMaps();
		//		creList.get(0).get("username");
		//		creList.get(0).get("password");
		DriverFactory.getDriver().get("http://localhost:90/login.do");
		lpObj=new LoginPage(DriverFactory.getDriver());
		dpObj=new DashBordPage(DriverFactory.getDriver());
		lpObj.doLogin("admin", "manager");
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertEquals(dpObj.getDashBordTitle(), expectedTitle);
		AppHooks.scn.log("Dashboard title matched!!");
	}

	@Then("User should get {int} tabs")
	public void user_should_get_tabs(int expectedMenuCount) {
		Assert.assertEquals(dpObj.getdashBoardMenuCount(), expectedMenuCount);
		AppHooks.scn.log("Dashboard menu sized matched!!");
	}

}
