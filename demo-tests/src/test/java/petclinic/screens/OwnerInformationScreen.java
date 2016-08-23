package petclinic.screens;

import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import al.qa.so.utils.url.UriComparator;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.modules.NavigationBarModule;

import static al.qa.so.ActAs.Transition;

@ScreenParams(urls = {"/owners/1"},
urlComparisonStrategy = UriComparator.CompareWithPathOnly.class)
public class OwnerInformationScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//h2[text()='Owner Information']")
    private SelenideElement title;

    @FindBy(xpath = "//input[@value='Edit Owner']")
    private SelenideElement buttonEditOwner;

    @FindBy(xpath = "//input[@value='Back to List']")
    private SelenideElement buttonBackToList;

    @FindBy(xpath = "//a[text()='Add New Pet']")
    private SelenideElement buttonAddNewPet;

    @ActionType(Transition)
        public EditOwnerScreen editOwner(){
            return perform(p->{
                buttonEditOwner.click();
            });
        }

    @ActionType(Transition)
        public AddNewPetScreen addNewPet(){
            return perform(p->{
                buttonAddNewPet.click();
            });
        }


    //FIXME: move it to NavigationBarScreen class
    @FindBy(xpath = "//body/div[contains(@class,'navbar')]")
    private NavigationBarModule navigationBar;

    public NavigationBarModule navigation() {
        return navigationBar;
    }
}
