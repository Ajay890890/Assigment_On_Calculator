package org.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.applicationHooks.AppHooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lets_be_FriendsPage {
	private WebDriver driver;
	//WebElement
	@FindBy(css="[name='name']")
	private WebElement nameField;

	@FindBy(css="[name='email']")
	private WebElement emailField;

	@FindBy(css = "[class='col-xs-6 col-xs-offset-3'] a")
	private WebElement b1;
	//	 -------------------------->>>>>
	@FindBy(css=".radio input")
	private List<WebElement> radioBtns;

	@FindBy(css="[class='col-xs-6 col-xs-offset-3'] a")
	private WebElement b2;

	//------------------------------------------>>>>>>>>>>>>>>>>>>


	@FindBy(css=".btn.btn-danger")
	private WebElement okbtn;

	//Constructor
	public Lets_be_FriendsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}


	//Action Methods
	public boolean isEmailFieldPresent() {
		return emailField.isDisplayed();

	}

	public void enterNameAndEmail() throws EncryptedDocumentException, IOException {
		nameField.sendKeys(AppHooks.exUtility.getSpecificValue(1, 0, "Sheet"));
		emailField.sendKeys(AppHooks.exUtility.getSpecificValue(1, 1,"Sheet"));

	}

	public void clickOnOkBtn() {
		b1.click();
//		new Actions(driver).click(b1).perform();
	}


	public int getRadioButtons() {
		return radioBtns.size();
	}

	public void selectPS4() {
		for(WebElement ele:radioBtns) {
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);

//			ele.click();
			break;
		}
	}

	public void clickOnb2() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", b2);
	}
	public boolean isPaymeytButtonPresent() {
		return okbtn.isDisplayed();

	}
	public void clickOnPaymentBtn() {
		okbtn.click();
	}
	public String getPopUpMsg() {
//		new WebDriverWait(driver,Duration.ofSeconds(6)).
//		until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert().getText();
		
	}
}
