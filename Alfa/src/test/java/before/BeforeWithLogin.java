package before;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.managers.StepManager;

import static utils.ConfigProvider.getProperty;
import static utils.WaitUrils.waitPageLoaded;

public class BeforeWithLogin extends BeforeMain {

    StepManager steps = new StepManager();

    @Before("@beforeWithLogin")
    public void beforeEach(){
        super.beforeEach();
        steps.getLoginSteps().enterLoginAndPassword(getProperty("user.login"), getProperty("user.password")).
                clickSubmitButton().
                enterPassword(getProperty("user.sms_password")).
                clickSubmitButton();
        waitPageLoaded();
    }

    @After("@beforeWithLogin")
    public void afterEach() {
        super.afterEach();
    }
}
