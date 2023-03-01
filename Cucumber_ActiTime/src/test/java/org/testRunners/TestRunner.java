package org.testRunners;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//package for TestNg run

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/org/features/LoginPage.feature",
		glue= {"org/stepDefinations","org/applicationHooks"},
		monochrome = true,//to clear garbage values of cucumber
		//dryRun=true--->to get stepDef after run as junit and implement them in StepDef.java
		dryRun = false,
//		tags="@smoke , @Regression ",//for Grouping purpose 
		plugin={
				"pretty",
				"junit:reportes/junit_report/junit_report.xml",
				"html:reportes/html_report/html_report.html",
				"json:reportes/json_report/json_report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//for extent report
				"rerun:reportes/failedReRun.txt"
		}		)
public class TestRunner {//extends AbstractTestNGCucumberTests-->run With TestNg

}
