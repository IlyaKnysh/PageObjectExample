import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){

        getUser().openHomePage()
                .verifyUserNameInputIsDisplayed()
                .verifyPasswordInputIsDisplayed()
                .loginIn("standard_user", "secret_sauce");

    }
}
