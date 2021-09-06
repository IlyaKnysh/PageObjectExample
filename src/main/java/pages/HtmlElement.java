package pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public interface HtmlElement extends AtlasWebElement<HtmlElement> {

    default boolean isPresent() {
        try {
            return !findElements(By.xpath("self::*")).isEmpty();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
