package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/featurefile/addcustomer.feature",
glue="stepdefinition",dryRun=false,plugin="json:target/cucumberreport.json",
strict=true,tags="@regression",monochrome=true)
public class TestRunner {

}
