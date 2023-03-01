package org.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtil {
	public void visibilityOfWebElement(WebDriver driver,int time, WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void ElementToBeClickable(WebDriver driver,int time, WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void clickon(WebDriver driver,int time,WebElement ele) {
		new WebDriverWait(driver,Duration.ofSeconds(time)).
		until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	public void sendKeys(WebDriver driver,int time, WebElement ele, String value) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
	public  String getCofigurationData(String key) throws IOException {
		try {

			FileInputStream fis=new FileInputStream("./properties/ConfigForActiTime.properties");
			Properties prp=new Properties();
			prp.load(fis);
			return prp.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void waitForClick(WebDriver driver, long time,WebElement ele) {
		new WebDriverWait(driver,Duration.ofSeconds(time)).
		until(ExpectedConditions.elementToBeClickable(ele));
	}

}
