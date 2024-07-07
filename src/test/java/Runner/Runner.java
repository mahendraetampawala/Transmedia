package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


/**
 * @author mahen
 *
 */

@CucumberOptions(features="src/test/resources/Feature", glue={"StepDefinitions"},plugin={"pretty","json:target/cucumber-json.jason"},
tags="@InvalidLogin")
public class Runner extends AbstractTestNGCucumberTests{

	
}
