package org.applicationHooks;

import java.io.IOException;
import java.util.Properties;

import org.factory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.utilities.ExcelUtil;
import org.utilities.configureReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {//configReader obj here
	private WebDriver driver;
	public static Scenario scn;
	public static Properties prop;
	public static ExcelUtil exUtility;

	@Before(order=21)
	public void launchBrowser(Scenario scn) throws IOException {
		configureReader cr=new configureReader();
		prop=cr.init_prop();
		System.out.println("Before hook");
		DriverFactory df=new DriverFactory();
		AppHooks.scn=scn;
//		 ExUtility=new ExcelUtil();
		 
		driver=df.init_driver(AppHooks.prop.getProperty("bName"));
	}
	@After (order=199)//max will be executed first
	public void tearDown() {
		System.out.println("After hook");
		driver.quit();
	}
	@After(order=200)
	public void takeScreenShot(Scenario scn) {
		if(scn.isFailed()) {
			String screenShotName=scn.getName().replaceAll(" ", "_");//to get scenario name 
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//String screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			scn.attach(screenshot, "image/png", screenShotName);
		}else {
			scn.log("Scenario is passed");
		}

	}
}
