package utils.managers;

import com.codeborne.selenide.Configuration;

import static utils.ConfigProvider.getProperty;

public class DriverManager {


    public void setUpDriver() {
        Configuration.baseUrl = getProperty("app.url");
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
    }
}
