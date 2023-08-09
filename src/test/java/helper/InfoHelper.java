package helper;

import models.InfoBuyer;
import models.InfoBuyerBuilder;
import utils.configuration.ReadPropertiesHW;

public class InfoHelper {
    public static InfoBuyer getUserInfo() {
        InfoBuyer infoBuyer = new InfoBuyer();
        infoBuyer.setFirstName(ReadPropertiesHW.firstname());
        infoBuyer.setLastName(ReadPropertiesHW.lastname());
        infoBuyer.setCode(ReadPropertiesHW.code());

        return infoBuyer;
    }
    public static InfoBuyerBuilder getUserInfoWithBuilder() {
        InfoBuyerBuilder infoBuyerBuilder = new InfoBuyerBuilder.Builder()
                .withFirstName("Test")
                .withLastName("Test")
                .withCode("123")
                .build();

        return infoBuyerBuilder;
    }
}