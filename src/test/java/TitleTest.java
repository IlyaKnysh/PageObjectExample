import org.testng.annotations.Test;

public class TitleTest extends BaseTest {


    @Test(groups = "functional")
    public void homePageTitleTest() {
        getUser().openHomePage()
                .verifyPageTitle("Test fail");
    }
}
