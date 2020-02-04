package steps.login;

import com.codeborne.selenide.Condition;
import lombok.AllArgsConstructor;
import pages.login.LoginPage;

@AllArgsConstructor
public class LoginSteps {

    LoginPage loginPage;


    public LoginSteps enterLoginAndPassword(String login, String password) {
        loginPage.getUserLogin().setValue(login);
        loginPage.getUserPassword().setValue(password);
        return this;
    }

    public LoginSteps clickSubmitButton() {
        loginPage.getSubmitButton().click();
        return this;
    }

    public void clickSubmitButtonAfterInsertSms(){
        loginPage.getSubmitButtonAfterInsertSms().click();
    }

    public LoginSteps enterSmsPassword(String smsPassword){
        loginPage.getSmsPasswordLabel()
                .shouldBe(Condition.visible)
                .setValue(smsPassword);
        return this;
    }

    public void setLogin(String login){
        loginPage.getUserLogin()
                .setValue(login);
    }

    public void setPassword(String password){
        loginPage.getUserPassword()
                .setValue(password); }

    public void incorrectLoginOrPasswordError(String message){
        loginPage.getInvalidLoginOrPassLabel()
                .shouldHave(Condition.exactText(message));
    }

    public void messageRequired(String message){
        loginPage.getRequiredFieldError()
                .shouldHave(Condition.exactText(message));
    }

}
