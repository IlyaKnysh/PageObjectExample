package webdriver;

import io.qameta.atlas.core.Atlas;
import org.openqa.selenium.WebDriver;

public abstract class WebDriverManagerAbstract {

    public abstract WebDriver getWebDriver();

    public abstract Atlas getAtlas();

    public abstract void stopWebDriver();

    public abstract void startWebDriver();

    public abstract void maximizeWindow();

}
