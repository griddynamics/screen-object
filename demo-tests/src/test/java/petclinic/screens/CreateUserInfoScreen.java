package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"/users?execution=e2s2"})
public class CreateUserInfoScreen extends NavigationBarScreen {

    @FindBy(xpath = "//input[@id='user.username']")
    private SelenideElement fieldUsername;

    @FindBy(xpath = "//input[@id='address']")
    private SelenideElement fieldAddress;

    @FindBy(xpath = "//input[@id='address2']")
    private SelenideElement fieldAddress2;

    @FindBy(xpath = "//input[@id='city']")
    private SelenideElement fieldCity;

    @FindBy(xpath = "//input[@id='state']")
    private SelenideElement fieldState;

    @FindBy(xpath = "//input[@id='zip']")
    private SelenideElement fieldZipCode;

    @FindBy(xpath = "//input[@id='phone']")
    private SelenideElement filedPhone;

    @Trait
    @FindBy(xpath = "//input[@value='Save Profile']")
    private SelenideElement buttonSaveUser;

    @FindBy(xpath = "//input[@name='_eventId_cancel']")
    private SelenideElement buttonCancel;
}
