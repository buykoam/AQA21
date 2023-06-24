package data;

import org.testng.annotations.DataProvider;

public class StaticProviderInt {
    @DataProvider(name = "Data for Div Int test", parallel = true)
    public static Object[][] dataForDivIntTest() {
        return new Object[][] {
                {-10, -2, 5},
                {0, 0, 0},
                {10, 2, 5},
                {0, 2, 0}
        };
    }
}
