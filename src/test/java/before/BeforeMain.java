package before;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.managers.DriverManager;

import static com.codeborne.selenide.Selenide.open;

public class BeforeMain {

    private DriverManager driverManager = new DriverManager();

    @Before(order = 20, value = "@before")
    public void beforeEach(){
        driverManager.setUpDriver();
        open("/");
    }

    @After("@before")
    public void afterEach() {
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
