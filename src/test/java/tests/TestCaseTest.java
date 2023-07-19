package tests;

import org.testng.annotations.Test;

public class TestCaseTest {

    @Test
    public void successLoginTest() {
    }

    @Test( dependsOnMethods = "successLoginTest")
    public void addCartTest() {

    }
}