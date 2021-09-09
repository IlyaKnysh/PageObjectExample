package steps;

import io.qameta.allure.Step;
import pages.InventoryPage;
import webdriver.WebDriverManagerAbstract;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;

public class InventoryPageSteps extends BasePageSteps {


    public InventoryPageSteps(WebDriverManagerAbstract driver) {
        super(driver);
    }

    protected InventoryPage onPage() {
        return on(InventoryPage.class);
    }

}