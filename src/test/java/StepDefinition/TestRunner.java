package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/java/features",
		tags = {"@Simple,@DataTable"},
		glue = {"StepDefinition"}
		)

public class TestRunner {

}
