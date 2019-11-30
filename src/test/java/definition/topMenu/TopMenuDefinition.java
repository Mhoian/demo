package definition.topMenu;

import cucumber.api.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import steps.topMenu.TopMenuSteps;

import java.util.List;

public class TopMenuDefinition {

    TopMenuSteps topMenuSteps;

    @Then("User see elements at Top menu page by names:$")
    public void verifyTopMenuElementPresent(List<String> names) {
        SoftAssertions softy = new SoftAssertions();
        names.forEach(name -> softy.assertThat(topMenuSteps.isTopMenuElementPresentByName(name)).
                as("There is no element with name ".concat(name)).
                isTrue());
    }
}
