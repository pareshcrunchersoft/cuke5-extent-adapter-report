package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"summary" }, strict = true)
public class RunCukeIT {

}