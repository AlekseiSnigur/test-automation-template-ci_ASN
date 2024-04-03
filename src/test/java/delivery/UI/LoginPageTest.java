package delivery.UI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageTest {
    @Test
    public void insertIncorrectPasswordAndCheckErrorMessage(){

        Selenide.open("http://35.208.34.242:3000/signin");
        //1Var:
        SelenideElement inputUserName = $(By.xpath("//*[@data-name=\"username-input\"]"));
        inputUserName.sendKeys("testuser");

        //2Var:
        $x("//*[@data-name=\"password-input\"]").sendKeys("127698767896863");

        SelenideElement signIn = $x("//*[@data-name=\"signIn-button\"]");
        signIn.click();
        SelenideElement errorInvalidCredentials = $x("//span[@data-name = 'authorisationError-popup-close-button']");
        errorInvalidCredentials.shouldBe(Condition.visible);
    }

}
