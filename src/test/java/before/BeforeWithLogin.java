package before;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.login.LoginPage;
import steps.login.LoginSteps;

import static utils.ConfigProvider.getProperty;

public class BeforeWithLogin extends BeforeMain {

    private LoginSteps loginSteps = new LoginSteps(new LoginPage());

    @Before("@beforeWithLogin")
    public void beforeEach(){
        super.beforeEach();
        loginSteps.enterEmailAndPassword(getProperty("user.login"), getProperty("user.password")).
                clickSubmitButton().
                enterSmsPassword(getProperty("user.sms_password"))
                .clickSubmitButtonAfterInsertSms();
    }

    @After("@beforeWithLogin")
    public void afterEach() {
        super.afterEach();
    }
}
