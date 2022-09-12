package StepDefinition;
import Pages.Admin_Registration_News;
import io.cucumber.java.en.Then;
import org.testng.Assert;
public class EnvelopeBtn_SD {


    Admin_Registration_News ParaLPage = new Admin_Registration_News();

        @Then("^I verify envelope button is enabled$")
        public void envelopeIsEnabled() {
            Assert.assertTrue(ParaLPage.isEnvelopeBtnEnabled()); }


    }

