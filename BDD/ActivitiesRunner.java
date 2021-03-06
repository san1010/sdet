package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/FeatureFiles",
    glue = {"stepDefinition"},
    tags = "@activity2_5",
    plugin = {"pretty"},
    monochrome = true
)

public class ActivitiesRunner {
    //empty
}