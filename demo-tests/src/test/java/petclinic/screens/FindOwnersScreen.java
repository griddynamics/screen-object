package petclinic.screens;


import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static al.qa.so.ActAs.Transition;

@ScreenParams(urls = {"/owners/find.html"})
public class FindOwnersScreen extends NavigationBarScreen {

    @FindBy(xpath = "//input[@id='lastName']")
    private SelenideElement fieldLastName;

    @Trait
    @FindBy(xpath = "//button[text()='Find Owner']")
    private SelenideElement buttonFindOwner;

    @FindBy(xpath = "//a[@href='/owners/new']")
    private SelenideElement buttonAddNew;

    @FindBy(xpath = "//input[@value='Add Owner']")
    private SelenideElement buttonAddOwner;

    @FindBy(xpath = "//input[@value='Cancel']")
    private SelenideElement buttonCancel;

    //FIXME: this action can transit to two different screens Owners and OwnerInformation
    @ActionType(Transition)
    public OwnerInformationScreen findOwner(String lastName) {
        return perform(p->{
            fieldLastName.setValue(lastName);
            buttonFindOwner.click();
        });
    }
}
