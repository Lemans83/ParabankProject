import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

<<<<<<< HEAD
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"StepDefinition"},
        tags = "@TC03",
=======

@RunWith(Cucumber.class)
@CucumberOptions (
       features = {"src/test/resources"},
        glue = {"StepDefinition"},
        tags = "@date",
>>>>>>> origin/ParabankFinal
        plugin = {"pretty","html:Reports/Default/"}
)
public class TestRunner {
}
