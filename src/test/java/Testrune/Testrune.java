package Testrune;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourse/demoblaze"},
plugin = {"json:target/cucumber.json"},
glue = "Steffdd",tags = {"@grs"})




public class Testrune extends AbstractTestNGCucumberTests {

}
