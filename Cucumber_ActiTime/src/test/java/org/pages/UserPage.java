package org.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	private WebDriver driver;

	//WebElement 

	@FindBy(css="[class='navItem navCell relative notSelected']>a[class*=tasks]")
	private WebElement TaskTab;

	@FindBy(xpath="//div[@class='addNewContainer']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement newCustomer;

	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameField;

	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDiscriptionField;

	@FindBy(id="customerLightBox_importProjectsDescriptions")
	private WebElement ImportProjectsDescriptionsCheckBox;

	@FindBy(id="customerLightBox_importTasksDescriptions")
	private WebElement ImportTasksDescriptionsCheckBox;

	@FindBy(id="customerLightBox_importTasksDescriptions")
	private WebElement CreateCustomerBtn;
	
	//@FindBy(xpath="//span[text()=\\\"Customer '\"+"AJAY"' has been created\\\"]")
	private WebElement CreateCustomerMsg;

	//Constructor
	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//driver initialization w.r.t page

	}

	//Action Methods
	public void clickOnTaskMenu() throws InterruptedException {
		TaskTab.click();
		Thread.sleep(4000);
	}
	public boolean isAddNewButtonDisplayed() {
		return addNewBtn.isDisplayed();
	}
	public boolean isNewCustomerField() {
		return newCustomer.isDisplayed();
	}
	public boolean isCustomerNameFieldDisplayed() {
		return customerNameField.isDisplayed();
	}
	public boolean isCustomerDiscriptionFieldDisplayed() {
		return customerDiscriptionField.isDisplayed();
	}
	public boolean isImportProjectsDescriptionsCheckBoxDisplayed() {
		return ImportProjectsDescriptionsCheckBox.isDisplayed();
	}
	public boolean isImportTasksDescriptionsCheckBoxDisplayed() {
		return ImportTasksDescriptionsCheckBox.isDisplayed();
	}
	public boolean isCreateCustomerBtnDisplayed() {
		return CreateCustomerBtn.isDisplayed();
	}
	
	public void clickOnNewbtnAndCustomerField() {
		new Actions(driver).click(addNewBtn).pause(Duration.ofSeconds(3)).click(newCustomer).perform();
	}
	public void enterInCustomerField() {
		customerNameField.clear();
		customerNameField.sendKeys("AJAY");
	}

	public void enterCustomerDescriptionField() {
		customerDiscriptionField.clear();
		customerDiscriptionField.sendKeys("AJAY IS AN ENGINNER");
	}
	public boolean CheckSelectedCheckBox() {
		if(ImportProjectsDescriptionsCheckBox.isSelected()&&ImportTasksDescriptionsCheckBox.isSelected())
		{
			return ImportProjectsDescriptionsCheckBox.isSelected();
		}else {
			return false;
		}
	}
	public void clickOnCreateCustomerBtn() {
		CreateCustomerBtn.click();
	}
	public String getCustomerCreatedMsg() {
		return CreateCustomerMsg.getText(); 
	}
	
	

}
