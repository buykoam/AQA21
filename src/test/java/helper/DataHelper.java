package helper;

import models.Info;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.configuration.ReadProperties;

public class DataHelper {
    static Logger logger = LogManager.getLogger(DataHelper.class);

    public static User getAdminUser() {
        User user = new User();
        user.setUser(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        logger.info(user.toString());
        return user;
    }
    public static Info getInfo() {
        Info info = new Info();
        info.setFirstname(ReadProperties.firstname());
        info.setLastname(ReadProperties.lastname());
        info.setCode(ReadProperties.code());

        logger.info(info.toString());
        return info;
    }
}