package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class WaitUrils {
    public static void waitPageLoaded() {
        Integer time = 0;
        do {
            Selenide.sleep(1000);
            time += 1;
        } while (!Selenide.executeJavaScript("return document.readyState").equals("complete") && time <= 500);
    }

    public static void hardSleep(long milliseconds) {
        Selenide.sleep(milliseconds);
    }

    public static void waitUntilEnabled(SelenideElement element) {
        int i = 0;
        while (!element.isEnabled() && i < 150) {
            hardSleep(200);
            i++;
        }
    }

}
