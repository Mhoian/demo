package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginPage {

    private SelenideElement userLogin = $(By.name("login")),
            userPassword = $(By.name("password")),
            submitButton = $x("//button[@type='submit']"),
            smsPasswordLabel = $(By.name("code")),
            submitButtonAfterInsertSms = $x("(//button[@type='submit'])[1]"),
            invalidEmailOrPassLabel = $x("//span[@data-error-type='_error']"),
            disabledButton = $x("//button[@type='submit' and @disabled]"),
            accountNumber = $(By.name("accountNumber")),
            accountOrCardNumber = $(By.name("accountOrCardNumber"));
}
