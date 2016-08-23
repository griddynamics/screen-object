package petclinic.screens;

import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static al.qa.so.ActAs.Transition;

//FIXME: Add wildcard comparator
@ScreenParams(urls = {"/owners/1/edit.html"})
public class EditOwnerScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//h2[text()='Update Owner']")
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

    @FindBy(xpath = "//input[@value='Update Owner']")
    private SelenideElement buttonUpdateOwner;

    @FindBy(xpath = "//input[@value='Cancel']")
    private SelenideElement buttonCancel;

    @ActionType(Transition)
        public OwnerInformationScreen updateOwner(){
            return perform(p->{
                buttonUpdateOwner.click();
            });
        }
}
