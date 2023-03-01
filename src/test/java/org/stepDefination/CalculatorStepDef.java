package org.stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.Hooks.AppHooks;
import org.apache.poi.EncryptedDocumentException;
import org.factory.DriverFactory;
import org.pages.CalculatorPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	CalculatorPage calObj;
	@Given("user is on calculator page")
	public void user_is_on_calculator_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		calObj=new CalculatorPage(DriverFactory.getDriver());
	

	}

	@When("User enters {int} plus {int}")
	public void user_enters_and(Integer N1, Integer N2) throws EncryptedDocumentException, IOException {
		calObj.addition(AppHooks.excelUtility.getSingleCellValue(1, 1), AppHooks.excelUtility.getSingleCellValue(1, 2));
		
	}

	@Then("The addition should be {int}")
	public void the_ressult_should_be(Integer add) {
		assertEquals(calObj.getAddition(),add);
		AppHooks.scn.log("Test case pass");
	}
	
	@When("User enters {int} minus {int}")
	public void user_enters_minus(Integer int1, Integer int2) throws EncryptedDocumentException, IOException {
		calObj.substraction(AppHooks.excelUtility.getSingleCellValue(2, 1),AppHooks.excelUtility.getSingleCellValue(2, 2));
	}
	
	@Then("The subtraction should be {int}")
	public void the_subtraction_should_be(Integer sub) {
		assertEquals(calObj.getSubstraction(),sub);
		AppHooks.scn.log("Test case pass");
	}
	@When("User enters {int} multiply by {int}")
	public void user_enters_multiply_by(Integer int1, Integer int2) throws EncryptedDocumentException, IOException {
		calObj.multiplication(AppHooks.excelUtility.getSingleCellValue(3, 1),AppHooks.excelUtility.getSingleCellValue(3, 2));
	}

	@Then("The multiplication should be {int}")
	public void the_multiplication_should_be(Integer mul) {
		assertEquals(calObj.getMultiplication(),mul);
		AppHooks.scn.log("Test case pass");
		
	}

	@When("User enters {int} divide by {int}")
	public void user_enters_divide_by(Integer int1, Integer int2) throws EncryptedDocumentException, IOException {
		calObj.division(AppHooks.excelUtility.getSingleCellValue(4, 1),AppHooks.excelUtility.getSingleCellValue(4, 2));
	}

	@Then("The division should be {int}")
	public void the_division_should_be(Integer div) {
		assertEquals(calObj.getDivision(),div);
		AppHooks.scn.log("Test case pass");
	}
}

