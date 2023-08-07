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

    public static String getUrl() {
        return properties.getProperty("url1");
    }

    public static String browserName() {
        return properties.getProperty("browser1");
    }

    public static String username() {
        return properties.getProperty("username1");
    }

    public static String password() {
        return properties.getProperty("password1");
    }
    public static String firstname() {
        return properties.getProperty("firstname");
    }
    public static String lastname() {
        return properties.getProperty("lastname");
    }
    public static String code() {
        return properties.getProperty("code");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless1").equalsIgnoreCase("true");
    }

    public static long timeout() {
        return 0;
    }
}