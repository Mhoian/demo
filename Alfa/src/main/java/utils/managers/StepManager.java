package utils.managers;

import lombok.Getter;
import steps.HomePageSteps;
import steps.LoginSteps;

public class StepManager {

    private final PageManager pageManager = new PageManager();

    @Getter(lazy = true)
    private final LoginSteps loginSteps = new LoginSteps(pageManager.getPage());

    @Getter(lazy = true)
    private final HomePageSteps homePageSteps = new HomePageSteps(pageManager.getPage());


}
