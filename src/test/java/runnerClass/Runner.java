package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucumber_http_result.html"},
                           features="src/test/java/featuresFiles/isay.feature",
                           glue="stepdefinations"

		)
public class Runner extends AbstractTestNGCucumberTests
{
	
	
}
