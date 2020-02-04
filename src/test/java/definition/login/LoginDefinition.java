package definition.login;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.AllArgsConstructor;
import steps.login.LoginSteps;
import steps.topMenu.TopMenuSteps;

import static utils.ConfigProvider.getProperty;

@AllArgsConstructor
public class LoginDefinition {

    LoginSteps loginSteps;
    TopMenuSteps topMenuSteps;

    @Given("User login as 'Default User' at Login page")
    public void enterDefaultEmailAndPassword() {
        loginSteps.enterLoginAndPassword(getProperty("user.login"), getProperty("user.password")).
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

    @Then("^User see error requrid fields (.*)$")
    public void userSeeErrorRequridFields(String message){
        loginSteps.messageRequired(message);
    }
}
