package ui;

import io.appium.java_client.pagefactory.WithTimeout;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.tsum.ru/login")
public class AuthPage extends PageObject {

    @FindBy(css = "p.auth-layout__control-button:nth-child(1)")
    private WebElement authButton;

    @FindBy(css = "p.auth-layout__control-button:nth-child(2)")
    private WebElement authRegButton;

    @FindBy(xpath = "/html/body/app-root/div/full-layout/div/div/auth-layout/div/div[4]/auth-register/form/div[1]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/app-root/div/full-layout/div/div/auth-layout/div/div[4]/auth-register/form/div[2]/input")
    private WebElement password;

    @FindBy(css = ".ui-button")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    private WebElement enterButton;


    @FindBy(css = "notice.notice:nth-child(1) ")
    private WebElement incorrectEmailPopup;

    @FindBy(css = "notice.notice:nth-child(1)")
    private WebElement incorrectPassPopup;


    public WebElement getIncorrectEmailPopup() {
        return incorrectEmailPopup;
    }

    public WebElement getIncorrectPassPopup() {
        return incorrectPassPopup;
    }

    public WebElement getAuthButton() {
        return authButton;
    }

    public WebElement getAuthRegButton() {
        return authRegButton;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getEnterButton() {
        return enterButton;
    }
}
