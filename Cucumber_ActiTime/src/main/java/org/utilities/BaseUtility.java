package org.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseUtility {
    private	WebDriver driver;
	public WebDriver startup  (String bName,String url) {
		if(bName.equalsIgnoreCase("ch")||bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "A:\\cmd prg\\Cucumber_project\\drivers\\chromedriver.exe");
		//	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			 
		}else if(bName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "\"A:\\elipse java programs\\maven salenium\\New_project\\drivers\\msedgedriver.exe\"");

			driver=new EdgeDriver();
		}else if(bName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "\"A:\\elipse java programs\\maven salenium\\New_project\\drivers\\geckodriver.exe\"");
			driver=new FirefoxDriver();
		}
		//driver.manage().window().maximize();
		//	driver.manage().window().setSize(new Dimension(250, 500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4.3
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//before 4.0


		driver.get(url);
		return driver;
	}
	
	
}
