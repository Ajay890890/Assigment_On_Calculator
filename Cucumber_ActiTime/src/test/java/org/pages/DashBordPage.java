package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordPage {
	private WebDriver driver;

	//WebElment 
	@FindBy(id="username")
	private WebElement uName;
	
	@FindBy(css="[name='pwd']")
	private WebElement pwd;
	
	@FindBy(css="#loginButton>div")
	private WebElement loginBtn;
	
	@FindBy(css="[class*='navItem navCell relative']")
	private List<WebElement> dashbordMenu;
	
	//Constructor
	public DashBordPage(WebDriver  driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	//Action Methods
	public String getDashBordTitle() {
		return driver.getTitle();
	}
	
	public void loginFeature(String userName, String password) {
		uName.sendKeys(userName);
		pwd.sendKeys(password);
		loginBtn.click();		
	}
	public int getdashBoardMenuCount() {
			return dashbordMenu.size();
	}
	public String getByDefaultSelectedTabName() {
		for(WebElement ele:dashbordMenu) {
			if(ele.getAttribute("class").contains("selected")) {
			
				return "TIME TRACK";
			}
		}
		return null;
	}
	
}
