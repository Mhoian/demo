package utils.managers;

import lombok.Getter;
import pages.HomePage;
import pages.LoginPage;

import static java.util.Objects.nonNull;

public class PageManager {

    @Getter
    private PageManager page;

    @Getter(lazy = true)
    private final LoginPage loginPage = new LoginPage();

    @Getter(lazy = true)
    private final HomePage homePage = new HomePage();

    public PageManager(){
        synchronized (PageManager.class){
            if (!nonNull(page)){
                page = this;
            }
        }
    }

}
