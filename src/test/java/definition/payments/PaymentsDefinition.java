package definition.payments;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lombok.AllArgsConstructor;
import steps.payments.PaymentsSteps;

import static com.codeborne.selenide.Selenide.sleep;

@AllArgsConstructor
public class PaymentsDefinition {

    private PaymentsSteps paymentsSteps;

    @Given("User click button create payment")
    public void buttonCreatePayment(){
        paymentsSteps.buttonCreatePayment();
        sleep(5000);
    }

    @Given("User click on menu hryvnia operation")
    public void hryvniaOperationLink(){
        paymentsSteps.hryvniaOperationLink();
    }

    @When("^User goes to the Payments menu$")
    public void userGoesToThePaymentsMenu() {
        paymentsSteps.paymentsLink();

    }
}
