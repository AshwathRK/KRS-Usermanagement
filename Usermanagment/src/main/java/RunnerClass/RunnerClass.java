package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)

@CucumberOptions (features = {"src\\main\\resources\\Featurefile"}, glue = {"ScenarioSteps"})

public class RunnerClass {

}
