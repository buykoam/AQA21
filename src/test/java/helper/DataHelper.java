package helper;

import models.Project;
import models.User;
import utils.configuration.ReadPropertiesHW;

public class DataHelper {

    public static User getAdminUser() {
        User user = new User();
        user.setEmail(ReadPropertiesHW.username());
        user.setPassword(ReadPropertiesHW.password());

        return user;
    }
    public static User getAdminUser1() {
        User user = new User();
        user.setUsername1(ReadPropertiesHW.username());
        user.setPassword1(ReadPropertiesHW.password());

        return user;
    }

    public static User getStandartUser() {
        User user = new User();
        user.setEmail(ReadPropertiesHW.username());
        user.setPassword(ReadPropertiesHW.password());

        return user;
    }
    public static Project getCommonProject() {
        Project project = new Project.Builder()
                .withProjectName("ssdfsd")
                .withProjectType(1)
                .withFlag(true)
                .withAnnouncement("asdasd")
                .build();

        return project;
    }
}