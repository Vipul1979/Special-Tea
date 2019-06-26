package Run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resources\\login.feature",
glue = "Steps")

public class RunCuke {


}
