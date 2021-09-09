package steps;

import pages.InventoryPage;
import webdriver.WebDriverManagerAbstract;

public class InventoryPageSteps extends BasePageSteps {


    public InventoryPageSteps(WebDriverManagerAbstract driver) {
        super(driver);
    }

    protected InventoryPage onPage() {
        return on(InventoryPage.class);
    }

}