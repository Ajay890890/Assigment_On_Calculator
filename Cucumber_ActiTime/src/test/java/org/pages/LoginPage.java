package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	//WebElement 
	@FindBy(css="#username")
	private WebElement uName;

	@FindBy(css="[name='pwd']")
	private WebElement pwd;

	@FindBy(css="#loginButton>div")
	private WebElement loginBtn;

	//Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//driver initialization w.r.t page
		this.driver=driver;
	}

	//Action Methods
	//1)validate fields
	public boolean isUserNameDisplay() {
		return uName.isDisplayed();
	}
	public boolean isPassWordFieldDisplay() {
		return pwd.isDisplayed();
	}
	public boolean isLoginBtnDisplay() {
		return loginBtn.isDisplayed();
	}
	public boolean getLoginPageTitle() {
		return driver.getTitle().equals("actiTIME - Login");
	}


	public void enterUserName() {
		uName.sendKeys("admin");
	}
	public void enterPassword() {
		pwd.sendKeys("manager");
	}
	public void clickOnLoginButton() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(5000);

	}
	//2)
	public void doLogin(String userName,String password) throws InterruptedException {
		uName.sendKeys(userName);
		pwd.sendKeys(password);
		loginBtn.click();
		Thread.sleep(4000);
	}
	public String getDashboardTitle() {
		return driver.getTitle();				
	}

}
