package petclinic.modules;

import al.qa.so.ScreenPart;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.model.User;

public class LoginFormModule extends ElementsContainer implements ScreenPart {

    @FindBy(xpath = "/h2")
    private SelenideElement title;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private SelenideElement fieldUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private SelenideElement fieldPassword;

    @FindBy(xpath = "//input[@name='rememberMe']")
    private SelenideElement chboxRememberMe;

    @Trait
    @FindBy(xpath = "//input[@type='submit']")
    private SelenideElement buttonLogin;

    public void login(User user) {
        fieldUsername.setValue(user.getUsername());
        fieldPassword.setValue(user.getPassword());
        buttonLogin.click();
    }
}
