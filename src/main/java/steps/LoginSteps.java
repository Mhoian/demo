package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import pages.LoginPage;

import static utils.WaitUrils.waitPageLoaded;

@AllArgsConstructor
public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps enterEmailAndPassword(String login, String password) {
        loginPage.getUserLogin().setValue(login);
        loginPage.getUserPassword().setValue(password);
        return this;
    }

    public LoginSteps clickSubmitButton() {
        loginPage.getSubmitButton().click();
        waitPageLoaded();
        return this;
    }

    public void clickSubmitButtonAfterInsertSms(){
        loginPage.getSubmitButtonAfterInsertSms().click();
        waitPageLoaded();
    }

    public LoginSteps enterSmsPassword(String smsPassword){
        loginPage.getSmsPasswordLabel().shouldBe(Condition.visible).setValue(smsPassword);
        return this;
    }

    public void isSubmitButtonEnabled() {
        loginPage.getDisabledButton()
                .isEnabled();
    }

    public SelenideElement isSmsPasswordLabelPresent() {
        return loginPage.getSmsPasswordLabel();
    }

    public void isInvalidEmailOrPassLabelPresent(String message) {
        loginPage.getInvalidEmailOrPassLabel()
                .shouldHave(Condition.exactText(message));
    }

    public void setAccountNumber(String accountNumber){
        loginPage.getAccountNumber()
                .shouldBe(Condition.visible)
                .val(accountNumber);

    }public void setAccountOrCardNumber(String accountOrCardNumber){
        loginPage.getAccountOrCardNumber()
                .shouldBe(Condition.visible)
                .val(accountOrCardNumber);
    }
}
