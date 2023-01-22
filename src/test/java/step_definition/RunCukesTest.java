package step_definition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = { "@ExploreMusic" }, 
		features = { "classpath:feature/" }, 
		glue = {"classpath:step_definition" }, 
		plugin = {"pretty", "html:target/cucumber-html-report.html",
				"json:target/cucumber.json", "html:target/cucumber-reports"}
				)
public class RunCukesTest {

}

