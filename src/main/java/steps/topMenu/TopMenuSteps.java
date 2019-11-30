package steps.topMenu;

import com.codeborne.selenide.Condition;
import lombok.AllArgsConstructor;
import pages.topMenu.TopMenuPage;

@AllArgsConstructor
public class TopMenuSteps {

    TopMenuPage topMenuPage;

    public void clickTopMenuElementByName(String name) {
        topMenuPage.getTopMenuElementsByName(name).click();
    }

    public boolean isTopMenuElementPresentByName(String name) {
        topMenuPage.getTopMenuElementsByName(name).shouldBe(Condition.appear);
        return true;
    }

    public void homePageTitle(String title){
        topMenuPage.getHomePageTitle()
                .shouldHave(Condition.exactText(title));
    }
}
