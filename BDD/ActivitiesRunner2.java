package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/FeatureFiles",
    glue = {"stepDefinition"},
    tags = "@SimpleAlert",
    plugin = {"html: test-reports"},
    monochrome = true
)

public class ActivitiesRunner2 {
    //empty
}