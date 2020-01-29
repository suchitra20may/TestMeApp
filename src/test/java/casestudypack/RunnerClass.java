package casestudypack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "casestudypack"},tags="@login",plugin = {"pretty","json:/target/cucumber.json"})
public class RunnerClass {

}
