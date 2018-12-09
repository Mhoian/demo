package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

@Getter
public class HomePage {

    public SelenideElement getHomePageElementsByName(String elementName) {
        return $x(format("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div", elementName));
    }
}
