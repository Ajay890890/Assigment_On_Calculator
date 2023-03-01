package org.stepDefinations;

import org.factory.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;
import org.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPageStepDef {
	private WebDriver driver;
	private UserPage upObj;
	private LoginPage lpObj;
	@Given("User has already logged in to application and clicked on Task tab")
	public void User_has_already_logged_in_to_application_and_clicked_on_Task_tab() throws InterruptedException {
		DriverFactory.getDriver().get("http://localhost:90/login.do");
		lpObj=new LoginPage(DriverFactory.getDriver());
		 upObj=new UserPage(DriverFactory.getDriver());
		 lpObj.doLogin("admin", "manager");
		 upObj.clickOnTaskMenu();
		 Thread.sleep(3000);
	}

	@Then("Task Tab is displayed")
	public void task_tab_is_displayed() {
		
		
	}
	@Given("User is on Task page")
	public void user_is_on_task_page() {
		
	}
	    @Then("Add new field is displayed")
	public void add_new_field_is_displayed() {
		Assert.assertTrue(upObj.isAddNewButtonDisplayed());
	}

	@Then("newCustomer field is displayed")
	public void new_customer_field_is_displayed() {
		Assert.assertTrue(upObj.isCreateCustomerBtnDisplayed());

	}

	@Then("customer Name Field is displayed")
	public void customer_name_field_is_displayed() {
		Assert.assertTrue(upObj.isCustomerNameFieldDisplayed());

	}

	@Then("customer Discription Field  is displayed")
	public void customer_discription_field_is_displayed() {
		Assert.assertTrue(upObj.isCustomerDiscriptionFieldDisplayed());

	}

	@Then("Import Projects Descriptions CheckBox  is displayed")
	public void import_projects_descriptions_check_box_is_displayed() {
		Assert.assertTrue(upObj.isImportProjectsDescriptionsCheckBoxDisplayed());

	}

	@Then("Import Tasks Descriptions CheckBox displayed")
	public void import_tasks_descriptions_check_box_displayed() {
		Assert.assertTrue(upObj.isImportTasksDescriptionsCheckBoxDisplayed());

	}
	@Given("User is on task tab")
	public void user_is_on_task_tab() {
		
		
	}

	@When("User clicks on add new button and clicks on  NEW CUSTOMER feild")
	public void user_clicks_on_add_new_button_and_clicks_on_new_customer_feild() {
		upObj.clickOnNewbtnAndCustomerField();
	}

	@When("user enters customer name")
	public void user_enters_customer_name() {
		upObj.enterInCustomerField();
		
	}

	@When("user enters customer description")
	public void user_enters_customer_description() {
		upObj.enterCustomerDescriptionField();
	}

	@When("user selctes checkbox")
	public void user_selctes_checkbox() {
		Assert.assertTrue(upObj.CheckSelectedCheckBox());
	}

	@When("clicks on create customer button")
	public void clicks_on_create_customer_button() {
		upObj.clickOnCreateCustomerBtn();
		
	}

	@Then("New costumer should be created")
	public void new_costumer_should_be_created() {
		System.out.println(upObj.getCustomerCreatedMsg());
	}

}
