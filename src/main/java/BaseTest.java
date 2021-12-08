import io.restassured.RestAssured;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import steps.WebDriverSteps;
import webdriver.FunctionalWebDriverManager;
import webdriver.WebDriverManagerAbstract;

import static io.restassured.RestAssured.given;
import static propsResolver.Properties.props;

public abstract class BaseTest {

    private final ThreadLocal<WebDriverManagerAbstract> driverManager = new ThreadLocal<>();
    private final ThreadLocal<WebDriverSteps> steps = new ThreadLocal<>();

    public WebDriverSteps getUser() {
        return steps.get();
    }

    @BeforeClass(alwaysRun = true)
    public void initRestAssured() {
        RestAssured.baseURI = props.apiUrl();
        RestAssured.requestSpecification = given()
                .relaxedHTTPSValidation();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        driverManager.set(new FunctionalWebDriverManager());
        driverManager.get().startWebDriver();
        steps.set(new WebDriverSteps(driverManager.get()));
    }

    @AfterMethod(alwaysRun = true)
    public void after(ITestResult result) {
        driverManager.get().stopWebDriver();
    }
}
