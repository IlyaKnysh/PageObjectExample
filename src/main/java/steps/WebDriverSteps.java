package steps;


import io.qameta.allure.Step;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import webdriver.WebDriverManagerAbstract;

public class WebDriverSteps {

    private WebDriverManagerAbstract webdriverManagerAbstract;
    private JavascriptExecutor executor;

    public WebDriverSteps(WebDriverManagerAbstract driver) {
        this.webdriverManagerAbstract = driver;
        this.executor = (JavascriptExecutor) driver.getWebDriver();
    }

    @Step
    public HomePageSteps openHomePage() {
        webdriverManagerAbstract.getWebDriver().get("https://www.saucedemo.com/");
        return new HomePageSteps(webdriverManagerAbstract);
    }

    protected <T extends WebPage> T on(Class<T> pageClass) {
        return webdriverManagerAbstract.getAtlas().create(webdriverManagerAbstract.getWebDriver(), pageClass);
    }

    protected WebDriverManagerAbstract getDriverManager() {
        return webdriverManagerAbstract;
    }

    protected WebDriver getDriver() {
        return webdriverManagerAbstract.getWebDriver();
    }

}
