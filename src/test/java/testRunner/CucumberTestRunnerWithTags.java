package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags="@smoke and @optional ",
		features= {"src/test/resources/featuresWithTags"},
		glue= {"stepDefinitions"},
		//plugin= {"pretty","json:target/report/htmlreport.json"}
		plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		monochrome = true
		)

public class CucumberTestRunnerWithTags extends AbstractTestNGCucumberTests {

}
