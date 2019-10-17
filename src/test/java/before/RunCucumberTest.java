package before;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static utils.ConfigProvider.getProperty;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        glue = {"before", "definition"},
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"}
)

public class RunCucumberTest {

    @BeforeClass
    public static void setUpDriver() {
        Configuration.baseUrl = getProperty("app.url");
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;
    }
}
