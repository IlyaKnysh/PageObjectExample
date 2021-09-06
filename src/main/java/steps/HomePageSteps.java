package steps;

import io.qameta.allure.Step;
import pages.HomePage;
import webdriver.WebDriverManagerAbstract;

public class HomePageSteps extends BasePageSteps {

    public HomePageSteps(WebDriverManagerAbstract driver) {
        super(driver);
    }

    @Step
    public HomePageSteps verifyUserNameInputIsDisplayed() {
        onPage().userNameInput().isDisplayed();
        return this;
    }

    @Step
    public HomePageSteps verifyPasswordInputIsDisplayed() {
        onPage().passwordInput().isDisplayed();
        return this;
    }

    @Step
    public InventoryPageSteps loginIn(String userName, String password) {
        onPage().userNameInput().sendKeys(userName);
        onPage().passwordInput().sendKeys(password);
        onPage().loginButton().click();
        return new InventoryPageSteps(getDriverManager());
    }

    protected HomePage onPage() {
        return on(HomePage.class);
    }
}
