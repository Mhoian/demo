package utils;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProvider {

    private static Properties prop = new Properties();
    private static InputStream input = null;

    @SneakyThrows
    public static String getProperty(final String propertyName) {
        input = new FileInputStream("src/main/resources/finik.properties");
        prop.load(input);
        return prop.getProperty(propertyName);
    }
}
