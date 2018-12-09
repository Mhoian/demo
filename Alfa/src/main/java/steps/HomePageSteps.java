package steps;

import lombok.AllArgsConstructor;
import utils.managers.PageManager;

@AllArgsConstructor
public class HomePageSteps {

    PageManager pages;

    public HomePageSteps clickHomeElementByName(String name){
        pages.getHomePage().getHomePageElementsByName(name).click();
        return this;
    }

    public boolean isHomeElementPresentByName(String name){
        return pages.getHomePage().getHomePageElementsByName(name).isDisplayed();
    }
}
