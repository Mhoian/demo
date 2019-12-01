package pages.payments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class PaymentsPage {

    private SelenideElement hryvniaOperation = $x("//li[@id='sidebarnav-3']"),
                            linkPayments = $x("//li[a[@href='/payments']]"),
                            buttonCreatePayment = $x("//button[span[text()='Створити платіж']]");

}
