import org.testng.annotations.Test;

public class TitleTest extends BaseTest {


    @Test
    public void homePageTitleTest() {
        getUser().openHomePage()
                .verifyPageTitle("Test fail");
    }
}
