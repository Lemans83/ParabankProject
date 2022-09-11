import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"StepDefinition"},
        tags = "@TC03",
        plugin = {"pretty","html:Reports/Default/"}
)
public class TestRunner {
}
