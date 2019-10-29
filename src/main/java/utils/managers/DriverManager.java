package utils.managers;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
//import org.junit.BeforeClass;

import static utils.ConfigProvider.getProperty;

public class DriverManager {

    public static void setUpDriver() {
        Configuration.baseUrl = getProperty("app.url");
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
    }
}
