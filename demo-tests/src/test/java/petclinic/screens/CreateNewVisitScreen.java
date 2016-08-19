package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//FIXME: Add wildcard comparator
@ScreenParams(urls = {"/owners/1/pets/1/visits/new"})
public class CreateNewVisitScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//h2[normalize-space(text())='New Visit']")
    private SelenideElement title;

    @FindBy(xpath = "//input[@value='Add Visit']")
    private SelenideElement buttonAddVisit;

    @FindBy(xpath = "//input[@value='Cancel']")
    private SelenideElement buttonCancel;
}
