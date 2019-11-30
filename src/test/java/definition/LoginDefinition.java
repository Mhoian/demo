package definition;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.AllArgsConstructor;
import steps.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.ConfigProvider.getProperty;
import static utils.WaitUrils.waitPageLoaded;

@AllArgsConstructor
public class LoginDefinition {

    LoginSteps loginSteps;


    @Given("User enter login (.*) and password (.*) at Login page")
    public void enterEmailAndPassword(String login, String password) {
        loginSteps.enterEmailAndPassword(login, password);
    }

    @Given("User login as 'Default User' at Login page")
    public void enterDefaultEmailAndPassword() {
        loginSteps.enterEmailAndPassword(getProperty("user.login"), getProperty("user.password")).
                clickSubmitButton();
    }

    @When("User click submit login form at Login page")
    public void clickSubmitButton() {
        loginSteps.clickSubmitButton();
    }

    @When("User enter password (.*) and make submit at Login page")
    public void enterPassword(String password) {
        loginSteps.enterSmsPassword(password)
                .clickSubmitButtonAfterInsertSms();
    }

    @When("User enter default sms-password and make submit at Login page")
    public void enterDefaultSmsPassword() {
        loginSteps.enterSmsPassword(getProperty("user.sms_password")).
                clickSubmitButtonAfterInsertSms();
        waitPageLoaded();
    }

    @Then("User see sms password required widget present at Login page")
    public void verifySmsPasswordRequiredPresent() {
        (loginSteps.isSmsPasswordLabelPresent()).shouldBe(Condition.appear);
    }

    @Then("User see error (.*) present at Login page")
    public void verifyInvalidEmailOrPassLabelPresent(String message) {
        loginSteps.isInvalidEmailOrPassLabelPresent(message);
    }

    @Then("User see disabled button Login present at Login page")
    public void verifyDisabledSubmitButton() {
        loginSteps.isSubmitButtonEnabled();
    }


    @And("^User set account number (.*)$")
    public void setAccountNumber(String accountNumber) {
        loginSteps.setAccountNumber(accountNumber);
    }

    @And("^User set account or card number (.*)$")
    public void setAccountOrCardNumber(String accountOrCardNumber) {
        loginSteps.setAccountOrCardNumber(accountOrCardNumber);
    }

}
