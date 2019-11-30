package pages.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginPage {

    private SelenideElement userLogin = $(By.id("login")),
                            userPassword = $(By.id("password")),
                            submitButton = $x("//button[@type='submit']"),
                            smsPasswordLabel = $(By.id("code")),
                            submitButtonAfterInsertSms = $x("(//button[@type='submit'])[1]"),
                            invalidLoginOrPassLabel = $x("//*[@class='server-error__text']"),
                            requiredFieldError = $x("//*[@class='form-input-error']");
}
