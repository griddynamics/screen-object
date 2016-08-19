package petclinic.screens;

import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static al.qa.so.ActAs.Transition;

//FIXME: Add wildcard comparator
@ScreenParams(urls = {"/owners/1/pets/new.html"})
public class AddNewPetScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//h2[normalize-space(text())='New Pet']")
    private SelenideElement title;

    @FindBy(xpath = "//input[@id='name']")
    private SelenideElement fieldName;

    @FindBy(xpath = "//input[@id='birthDate']")
    private SelenideElement fieldBirthDate;

    //FIXME: Add dropdown

    @FindBy(xpath = "//input[@value='Add Pet']")
    private SelenideElement buttonAddPet;

    @FindBy(xpath = "//input[@value='Cancel']")
    private SelenideElement buttonCancel;

    @ActionType(Transition)
        public OwnerInformationScreen cancel(){
            return perform(p->{
                buttonCancel.click();
            });
        }

}
