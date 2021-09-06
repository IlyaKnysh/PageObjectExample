package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;

import static java.util.Arrays.asList;

public class FunctionalWebDriverManager extends WebDriverManagerAbstract {

    private WebDriver driver;
    private Atlas atlas;

    public void startWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        HashMap<String, java.io.Serializable> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromeOptions.setExperimentalOption("prefs", chromePrefs)
                .setExperimentalOption("excludeSwitches", asList("enable-automation", "load-extension"))
                .addArguments("--alsoDoNotRetry-certificate-errors, --restrict-iframe-permissions",
                        "--disable-popup-blocking", "disable-infobars", "--disable-extensions");
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        driver = new ChromeDriver(chromeOptions);
        atlas = new Atlas(new WebDriverConfiguration(driver));
        maximizeWindow();
    }

    @Override
    public void stopWebDriver() {
        if (driver != null) driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public Atlas getAtlas() {
        return atlas;
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

}
