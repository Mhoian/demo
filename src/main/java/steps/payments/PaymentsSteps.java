package steps.payments;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Condition.*;
import lombok.AllArgsConstructor;
import pages.payments.PaymentsPage;

@AllArgsConstructor
public class PaymentsSteps {

    private PaymentsPage paymentsPage;

    public void buttonCreatePayment(){
        paymentsPage.getButtonCreatePayment()
                .shouldBe(Condition.visible)
                .click();
    }

    public void hryvniaOperationLink(){
        paymentsPage.getHryvniaOperation()
                .shouldBe(Condition.visible)
                .click();
    }

    public void paymentsLink(){
        paymentsPage.getLinkPayments()
                .shouldBe(Condition.visible)
                .click();
    }
}
