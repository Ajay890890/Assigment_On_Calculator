package org.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static ThreadLocal<WebDriver>tlDriver=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String bName) {
		if(bName.equalsIgnoreCase("ch")||bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=	new ChromeOptions();
			co.addArguments("start-maximized");
			tlDriver.set(new ChromeDriver(co));

		}
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();

	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();

	}


}
