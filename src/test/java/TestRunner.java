import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"StepDefinition"},
        tags = "@TC01",
//        tags = "@TC_08",

        plugin = {"pretty","html:Reports/Default/"}
)
public class TestRunner {
}
