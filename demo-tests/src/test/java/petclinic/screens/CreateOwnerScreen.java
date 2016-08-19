package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"/owners/new"})
public class CreateOwnerScreen {

    @Trait
    @FindBy(xpath = "//h2[text()='Create Owner']")
    private SelenideElement title;

    @FindBy(xpath = "//input[@id='firstName']")
    private SelenideElement fieldFistName;

    @FindBy(xpath = "//input[@id='lastName']")
    private SelenideElement fieldLastName;

    @FindBy(xpath = "//input[@id='address']")
    private SelenideElement fieldAddress;

    @FindBy(xpath = "//input[@id='city']")
    private SelenideElement fieldCity;

    @FindBy(xpath = "//input[@id='telephone']")
    private SelenideElement fieldPhone;

    @FindBy(xpath = "//input[@value='Add Owner']")
    private SelenideElement buttonAddOwner;

    @FindBy(xpath = "//input[@value='Cancel']")
    private SelenideElement buttonCancel;

}