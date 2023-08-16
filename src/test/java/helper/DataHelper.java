package helper;

import models.User;
import utils.configuration.ReadProperties;
import utils.configuration.ReadPropertiesHW;

public class DataHelper {

    public static User getAdminUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        return user;
    }

    public static User getStandartUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        return user;
    }
    public static User getAdminUser1() {
        User user = new User();
        user.setUsername1(ReadPropertiesHW.username());
        user.setPassword1(ReadPropertiesHW.password());

        return user;
    }
}