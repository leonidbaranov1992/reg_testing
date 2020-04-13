package steps;


import net.thucydides.core.annotations.Step;
import ui.AuthPage;
import ui.SuccessAuthPage;

import java.util.UUID;

public class Navigation {

    AuthPage authPage;
    SuccessAuthPage successAuthPage;

    @Step
    public void isOnAuthPage() {
        authPage.open();
    }

    public void isOnSuccessAuthPage() {
        assert successAuthPage.getTitle() != null;
    }

    @Step
    public boolean isEnterButtonEnabled() {
        return authPage.getEnterButton().isEnabled();
    }

    @Step
    public void isEnterButtonDisabled() {
        assert authPage.getEnterButton().isEnabled() == false;
    }

    @Step
    public void clickOnButton(String element) {
        switch (element) {
            case "Auth":
                authPage.getAuthButton().click();
                break;
            case "Registration":
                authPage.getAuthRegButton().click();
                break;
            case "Enter":
                authPage.getEnterButton().click();
        }
    }

    @Step
    public void setAnEmail(String email) {
        authPage.getEmail().sendKeys(email);
    }

    @Step
    public void setPassword(String pass) {
        authPage.getPassword().sendKeys(pass);
    }

    @Step
    public void popUpIsShown(String popup) {
        switch (popup) {
            case "incorrect email":
                assert authPage.getIncorrectEmailPopup().isDisplayed();
                break;
            case "incorrect password":
                assert authPage.getIncorrectPassPopup().isDisplayed();
                break;
        }
    }

    public static String createRandomString() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-","").substring(0,8);
    }

    public static String createRandomEmail() {
        return createRandomString() + "@mail.ru";
    }
}
