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
			//System.setProperty("webdriver.chrome.driver", "A:\\cmd prg\\Cucumber_project\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=	new ChromeOptions();
			co.addArguments("start-maximized");
			//	driver=new ChromeDriver();
			tlDriver.set(new ChromeDriver(co));

		}
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
		//calling line no 25 method to get (synchronized)driver

	}
	public static synchronized WebDriver getDriver() {
		//Returning driver because on line no 6 we hv declare obj of ThreadLocal
		//which has get() method inbuilt from encapsulation
		return tlDriver.get();

	}
}
