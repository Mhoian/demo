package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginPage {

    private SelenideElement
            userDefault = $(By.name("login")),
            userPassword = $(By.name("password")),
            submitButton = $("._2tiE-F1f1TR43Yjq6F4m5x"),
            smsPasswordLabel = $("._21Etq__ZhngtN1jRyI0Q9R"),
            submitButtonAfterInsertSms = $("._23Gmnr4NZ2uDhLHRses3BF"),


            treatmentLabel = $x("//span[contains(text(),'Обработка...')]"),
            invalidEmailOrPassLabel = $("._2zRWHiYIndwd1cpo_6FRW7 > span:nth-child(1)"),
            invalidSmsPassLabel = $x("//*[contains(text(),'Неверный смс пароль')]");
}
