package utils.configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl1() {
        return properties.getProperty("url1");
    }

    public static String browserName1() {
        return properties.getProperty("browser1");
    }

    public static String username1() {
        return properties.getProperty("username1");
    }

    public static String password1() {
        return properties.getProperty("password1");
    }

    public static boolean isHeadless1() {
        return properties.getProperty("headless1").equalsIgnoreCase("true");
    }
    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String username() {
        return properties.getProperty("username");
    }

    public static String password() {
        return properties.getProperty("password");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public static boolean isHeadless2() {
        return properties.getProperty("headless1").equalsIgnoreCase("true");
    }
    public static String getUrl2() {
        return properties.getProperty("url2");
    }
}