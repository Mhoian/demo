package pages.topMenu;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

@Getter
public class TopMenuPage {

    public SelenideElement getTopMenuElementsByName(String elementName) {
        return $x(format("//*[contains(text(),'%s')]", elementName));
    }

    private SelenideElement homePageTitle = $x("//*[@class='home-page__title']");
}
