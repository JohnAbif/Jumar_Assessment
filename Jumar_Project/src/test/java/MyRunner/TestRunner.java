package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Dev2\\Jumar_project\\src\\main\\java\\Features\\createAccount.feature",
			glue={"stepDefinition"}, 
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			monochrome = true, 
			strict = true, 
			dryRun = false 		
			)
	 
	public class TestRunner {
	 
	}


