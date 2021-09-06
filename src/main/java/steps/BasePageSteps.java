package steps;

import pages.BasePage;
import webdriver.WebDriverManagerAbstract;

public class BasePageSteps extends WebDriverSteps {

    public BasePageSteps(WebDriverManagerAbstract driver) {
        super(driver);
    }

    protected BasePage onPage() {
        return on(BasePage.class);
    }
}
