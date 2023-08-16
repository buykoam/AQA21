package tests;

import com.github.dockerjava.api.command.UpdateSwarmCmd;
import helper.DataHelper;
import models.User;
import models.UserBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LombokTestHW {
    @Test
    public void toStringTestHW(){
        User user = DataHelper.getAdminUser1();
        System.out.println(user.toString());
    }
    @Test
    public void equalsTest(){
        User user1 = DataHelper.getAdminUser1();
        User user2 = DataHelper.getAdminUser1();
        Assert.assertTrue(user1.equals(user2));
    }

    @Test
    public void constructorTest(){
       User user = new User("test", "test");
        System.out.println(user);
    }
    @Test
    public void builderTest(){
        UserBuilder user = UserBuilder.builder()
                        .id(1)
                        .password1("test")
                        .username1("test")
                        .build();
        UserBuilder user2 = UserBuilder.builder()
                .id(2)
                .password1("test")
                .username1("test")
                .build();
        System.out.println(user2);

        Assert.assertTrue(user.equals(user2));
        System.out.println(user);
    }
}
