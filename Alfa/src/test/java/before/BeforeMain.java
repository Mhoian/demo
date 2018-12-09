package before;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;
import static utils.managers.DriverManager.setUpDriver;

public class BeforeMain {

    @Before("@before")
    public void beforeEach(){
        setUpDriver();
        open("");
    }

    @After("@before")
    public void afterEach() {
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
