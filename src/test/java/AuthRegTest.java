import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Navigation;


@RunWith(SerenityRunner.class)
public class AuthRegTest {

    @Managed
    private WebDriver browser;

    @Steps
    Navigation navigation;


    @Test
    public void firstNegativeScenario() {
        //Given
        navigation.isOnAuthPage();
        //When
        navigation.clickOnButton("Registration");
        navigation.setAnEmail("abc@mail.ru");
        //Then
        navigation.isEnterButtonDisabled();
    }

    @Test
    public void secondNegativeScenario() {
        //Given
        navigation.isOnAuthPage();
        //When
        navigation.clickOnButton("Registration");
        navigation.setAnEmail("abc");
        navigation.setPassword("password");
        navigation.isEnterButtonEnabled();
        navigation.clickOnButton("Enter");
        //Then
        navigation.popUpIsShown("incorrect email");
    }

    @Test
    public void firstPositive() {
        //Given
        navigation.isOnAuthPage();
        navigation.clickOnButton("Registration");
        navigation.setAnEmail(navigation.createRandomEmail());
        navigation.setPassword(navigation.createRandomString());
        //Then
        navigation.isEnterButtonEnabled();
    }

    @Test
    public void secondPositive() {
        //Given
        navigation.isOnAuthPage();
        //When
        navigation.clickOnButton("Registration");
        navigation.setAnEmail(navigation.createRandomEmail());
        navigation.setPassword(navigation.createRandomString());
        navigation.isEnterButtonEnabled();
        navigation.clickOnButton("Enter");
        //Then
        navigation.isOnSuccessAuthPage();
    }
}