package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"/users?execution=e1s1"})
public class CreateUserScreen extends NavigationBarScreen {

    @FindBy(xpath = "//input[@id='username']")
    private SelenideElement fieldUsername;

    @FindBy(xpath = "//input[@id='email']")
    private SelenideElement fieldMail;

    @FindBy(xpath = "//input[@id='name']")
    private SelenideElement fieldname;

    @FindBy(xpath = "//input[@id='uiPassword']")
    private SelenideElement fieldPassword;

    @FindBy(xpath = "//input[@id='verifyPassword']")
    private SelenideElement fieldPasswordVerify;

    @Trait
    @FindBy(xpath = "//input[@value='Create User']")
    private SelenideElement buttonCreateUser;

    @FindBy(xpath = "//input[@name='_eventId_cancel']")
    private SelenideElement buttonCancel;
}
