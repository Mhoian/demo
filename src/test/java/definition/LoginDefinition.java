package definition;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.AllArgsConstructor;
import steps.LoginSteps;
import steps.topMenu.TopMenuSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.ConfigProvider.getProperty;
import static utils.WaitUrils.waitPageLoaded;

@AllArgsConstructor
public class LoginDefinition {

    LoginSteps loginSteps;
    TopMenuSteps topMenuSteps;

    @Given("User login as 'Default User' at Login page")
    public void enterDefaultEmailAndPassword() {
        loginSteps.enterEmailAndPassword(getProperty("user.login"), getProperty("user.password")).
                clickSubmitButton();
    }

    @When("User click submit login form at Login page")
    public void clickSubmitButton() {
        loginSteps.clickSubmitButton();
    }

    @When("User enter default sms-password and make submit at Login page")
    public void enterDefaultSmsPassword() {
        loginSteps.enterSmsPassword(getProperty("user.sms_password")).
                clickSubmitButtonAfterInsertSms();
    }

    @Then("^User see title at Home page (.*)$")
    public void userSeeElementsAtHomePage(String title){
        topMenuSteps.homePageTitle(title);
    }

    @Given("^User set login (.*)$")
    public void userSetLoginLogin(String login) {
        loginSteps.setLogin(login);
    }

    @Then("^User set password (.*)$")
    public void userSetPasswordPassword(String password) {
        loginSteps.setPassword(password);
    }

    @And("^User can see error (.*)$")
    public void userCanSeeError(String message) {
        loginSteps.incorrectLoginOrPasswordError(message);
    }
}
