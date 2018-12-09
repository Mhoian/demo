package definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.AllArgsConstructor;
import utils.managers.StepManager;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.ConfigProvider.getProperty;
import static utils.WaitUrils.waitPageLoaded;

@AllArgsConstructor
public class LoginDefinition {

    StepManager stepManager;

    @Given("User login as 'Default User' at Login page")
    public void enterLoginAndPassword() throws InterruptedException {
        stepManager.getLoginSteps().enterLoginAndPassword(getProperty("user.login"), getProperty("user.password"))
                .clickSubmitButton();
        waitPageLoaded();
    }
    @When("User see sms password required widget present at Login page")
    public void enterSmsPasswor(){
        stepManager.getLoginSteps().isSmsPasswordLabelPresent();
        stepManager.getLoginSteps().enterSmsPassword(getProperty("user.sms_password"));
        stepManager.getLoginSteps().clickSubmitButtonAfterInsertSms();
        waitPageLoaded();
    }
    @Then("User see elements at Home page")
    public void verifySmsPasswordRequiredPresent(){
        waitPageLoaded();
        assertThat(stepManager.getHomePageSteps());
    }

    @Given("User login as 'Invalid User' at Login page and InvalidPassword")
    public void enterLoginAndInvalidPassword(){
        stepManager.getLoginSteps().enterLoginAndPassword(getProperty("user.invalid.login"), getProperty("user.invalid.password"))
                .clickSubmitButton();
        waitPageLoaded();
    }

    @Then("User see error message 'Invalid login or password'")
    public void verifyInvalidLoginAndPassword(){
        assertThat(stepManager.getLoginSteps().isInvalidEmailOrPassLabelPresent())
        .as("Invalid login or password")
        .isTrue();
    }

    @Given("User enter email (.*) and password (.*) and make submit at Login page")
    public void notEnterLoginAndPassword(String login, String password){
        stepManager.getLoginSteps().enterLoginAndPassword(login, password).clickSubmitButton();
        waitPageLoaded();
    }

    @Then("User see error 'Invalid login or password'")
    public  void verifyLoginAndPasswordFields(){
        assertThat(stepManager.getLoginSteps().isInvalidEmailOrPassLabelPresent())
                .as("Invalid login or password")
                .isTrue();
    }

}
