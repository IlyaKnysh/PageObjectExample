package steps;

import io.qameta.allure.Step;
import pages.BasePage;
import webdriver.WebDriverManagerAbstract;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasePageSteps extends WebDriverSteps {

    public BasePageSteps(WebDriverManagerAbstract driver) {
        super(driver);
    }

    @Step
    public BasePageSteps verifyPageTitle(String title) {
        String actualTitle = getDriver().getTitle();
        assertThat(format("Page title is %s instead of %s", actualTitle, title), actualTitle.equals(title));
        return this;
    }

    protected BasePage onPage() {
        return on(BasePage.class);
    }
}
