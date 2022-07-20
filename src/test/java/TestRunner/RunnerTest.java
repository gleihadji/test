package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = { "StepDefintions" },
        plugin = { "pretty","json:target/cucumber-reports/Cucumber.json" },
//tags = { "@TEST_TES-2" },
        tags="@TEST_TES-2",
        dryRun = false)
public class RunnerTest {
}
