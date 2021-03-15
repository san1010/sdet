package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/FeatureFiles",
    glue = {"stepDefinition"},
    tags = "@activity1_3 "
)

public class ActivitiesRunner {
    //empty
}