package org.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/feactures/Operations.feature", 
         glue = { "org/stepDefination","org/Hooks" }, 
         monochrome = true, 
         dryRun = false, 
         plugin = { "pretty",
				"html:reportes/html_report/html_report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:reportes/failedReRun.txt"
})
public class TestRunner {

}
