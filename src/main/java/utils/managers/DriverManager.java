package utils.managers;

import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.open;
import static java.util.Objects.nonNull;
import static utils.ConfigProvider.getProperty;

public class DriverManager {

    private static final Logger LOGGER = Logger.getLogger(DriverManager.class);

    public static void setUpDriver() {

        LOGGER.info("Start chrome driver");
        String url = System.getenv("URL");
        if (url != null) {
            Configuration.baseUrl = url;
        } else {
            Configuration.baseUrl = getProperty("app.url");
        }
        Configuration.timeout= 30000;
        Configuration.fileDownload = PROXY;
        Configuration.proxyEnabled =true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1855x1060";

        if (nonNull(System.getProperty("env"))) {
            Configuration.proxyHost = "172.17.0.1";
            Configuration.headless = true;
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("chrome");
            Configuration.browserCapabilities = desiredCapabilities;
            Configuration.remote = "http://localhost:4444/wd/hub";
        }

        if (nonNull(System.getProperty("headless"))) {
            Configuration.headless = true;
        }


        open("/");
    }
}
