package steps;

import lombok.AllArgsConstructor;
import utils.managers.PageManager;

import static utils.WaitUrils.waitUntilEnabled;

@AllArgsConstructor
public class LoginSteps {

    PageManager pages;

    public LoginSteps enterLoginAndPassword(String login, String password) {
        pages.getLoginPage().getUserDefault().setValue(login);
        pages.getLoginPage().getUserPassword().setValue(password);
        return this;
    }

    public LoginSteps enterPassword(String password) {
        pages.getLoginPage().getUserPassword().setValue(password);
        return this;
    }

    public LoginSteps clickSubmitButton() {
        pages.getLoginPage().getSubmitButton().click();
        return this;
    }

    public LoginSteps clickSubmitButtonAfterInsertSms(){
        pages.getLoginPage().getSubmitButtonAfterInsertSms().click();
        return this;
    }

    public boolean isSubmitButtonEnabled() {
        return pages.getLoginPage().getSubmitButton().isEnabled();
    }

    public boolean isSmsPasswordLabelPresent() {
        waitUntilEnabled(pages.getLoginPage().getSubmitButton());
        return pages.getLoginPage().getSmsPasswordLabel().isDisplayed();

    }
    public LoginSteps enterSmsPassword(String smsPassword){
        pages.getLoginPage().getSmsPasswordLabel().setValue(smsPassword);
        return this;
    }

    public boolean isInvalidEmailOrPassLabelPresent() {
        return pages.getLoginPage().getInvalidEmailOrPassLabel().isDisplayed();
    }

    public boolean isInvalidSmsPassLabelPresent() {
        return pages.getLoginPage().getInvalidSmsPassLabel().isDisplayed();
    }
}
