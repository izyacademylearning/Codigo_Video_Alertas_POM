package co.com.qvision.conduit.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/alert.feature",
        glue = "co.com.qvision.conduit.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false)
public class AlertRunner {
}
