package delivery.UI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import delivery.utils.RandomDataGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageTest {

    @BeforeEach
    public void openLoginPage(){
        Selenide.open("http://35.208.34.242:3000/signin");
    }

    @Test
    public void enterIncorrectCredentialsAndCheckErrorMessage(){
        //1Var:
        SelenideElement inputUserName = $(By.xpath("//*[@data-name=\"username-input\"]"));
        inputUserName.sendKeys(RandomDataGenerator.generateName());

        //2Var:
        $x("//*[@data-name=\"password-input\"]").sendKeys(RandomDataGenerator.generatePassword());
        SelenideElement signIn = $x("//*[@data-name=\"signIn-button\"]");
        signIn.click();
        SelenideElement errorInvalidCredentials = $x("//span[@data-name = 'authorisationError-popup-close-button']");
        errorInvalidCredentials.shouldBe(Condition.visible);
    }

    @Test
    public void enterCorrectCredentials(){
        $x("//*[@data-name=\"username-input\"]").sendKeys(System.getProperty("username"));
        $x("//*[@data-name=\"password-input\"]").sendKeys(System.getProperty("password"));
        $x("//*[@data-name=\"signIn-button\"]").click();
        //Cannot add expected result (Xpath) because of broken test ENV
    }

}
