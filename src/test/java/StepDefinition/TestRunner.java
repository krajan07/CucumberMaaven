package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//Added Json report
@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-html", "json:target/cucumber.json"},
		features = "src/test/java/features",
		tags = {"@Simple,@DataTable"},
		glue = {"StepDefinition"}
		)

public class TestRunner {

}
