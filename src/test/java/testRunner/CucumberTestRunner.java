package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags="",
		features= {"src/test/resources/features"},
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:target/htmlreport.html",
				"pretty","json:target/htmlreport.json"
				}
		
		)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
