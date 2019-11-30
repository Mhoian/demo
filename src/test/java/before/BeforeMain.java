package before;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.managers.DriverManager;

import static com.codeborne.selenide.Selenide.open;
import static utils.managers.DriverManager.setUpDriver;

public class BeforeMain {

    @Before(order = 20, value = "@before")
    public void beforeEach(){
        setUpDriver();
    }

    @After("@before")
    public void afterEach() {
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
