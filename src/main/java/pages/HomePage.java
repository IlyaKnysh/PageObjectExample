package pages;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface HomePage extends BasePage {

    @FindBy("//input[@id = 'user-name']")
    HtmlElement userNameInput();

    @FindBy("//input[@id = 'password']")
    HtmlElement passwordInput();

    @FindBy("//input[@id = 'login-button']")
    HtmlElement loginButton();
}
