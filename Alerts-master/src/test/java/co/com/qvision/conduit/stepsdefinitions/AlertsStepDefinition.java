package co.com.qvision.conduit.stepsdefinitions;

import co.com.qvision.conduit.steps.AlertsStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;


public class AlertsStepDefinition {


    @Managed
    WebDriver driver;

    @Steps
    AlertsStep alertStep;


    @Given("^he user is on the page demo$")
    public void heUserIsOnThePageDemo() {
        alertStep.openBrowser();
        alertStep.deleteAdd();
    }
    @When("He user go the alert page")
    public void heUserGoTheAlertPage() {
      alertStep.clickCardAlert();
      alertStep.goAlertSection();

    }

    @Then("the user accepts the alert")
    public void theUserAcceptsTheAlert() {
         alertStep.acceptSeguindaAlerta();

    }
    @After
    public void cerrarNavegador() {
    driver.quit();
    }
}
