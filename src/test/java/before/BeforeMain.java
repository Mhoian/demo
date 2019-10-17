package before;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class BeforeMain {

    @Before(order = 20, value = "@before")
    public void beforeEach(){
        open("");
    }

    @After("@before")
    public void afterEach() {
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
