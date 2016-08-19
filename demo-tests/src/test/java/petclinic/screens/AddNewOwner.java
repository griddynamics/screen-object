package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"/owners/new"})
public class AddNewOwner extends NavigationBarScreen {

    @FindBy(xpath = "//input[@id='firstName']")
    private SelenideElement fieldFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private SelenideElement fieldLastName;

    @FindBy(xpath = "//input[@id='address']")
    private SelenideElement fieldAddress;

    @FindBy(xpath = "//input[@id='city']")
    private SelenideElement fieldCity;

    @FindBy(xpath = "//input[@id='telephone']")
    private SelenideElement fieldPhone;


}
