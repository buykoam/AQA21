package helper;

import models.InfoBuyer;
import models.User;
import utils.configuration.ReadProperties;

public class InfoHelper {
    public static InfoBuyer getUserInfo() {
        InfoBuyer infoBuyer = new InfoBuyer();
        infoBuyer.setFirstName(ReadProperties.firstname());
        infoBuyer.setLastName(ReadProperties.lastname());
        infoBuyer.setCode(ReadProperties.code());

        return infoBuyer;
    }
}
