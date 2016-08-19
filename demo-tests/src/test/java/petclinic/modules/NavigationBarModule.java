package petclinic.modules;


import al.qa.so.ScreenPart;
import al.qa.so.anno.ActionType;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.screens.*;

import static al.qa.so.ActAs.Transition;

public class NavigationBarModule extends ElementsContainer implements ScreenPart {

    @Trait
    @FindBy(xpath = "//a[.='PetClinic']")
    private SelenideElement labelBrand;

    @FindBy(xpath = "//a[@href='/']")
    private SelenideElement linkHome;

    @FindBy(xpath = "//a[@href='/owners/find.html']")
    private SelenideElement linkFindOwners;

    @FindBy(xpath = "//a[@href='/vets/list.html']")
    private SelenideElement linkVeterinarians;

    @FindBy(xpath = "//a[@href='/oups.html']")
    private SelenideElement linkError;

    @FindBy(xpath = "//a[@href='/messages']")
    private SelenideElement linkInbox;

    @FindBy(xpath = "//a[@title='Logout']")
    private SelenideElement linkLogout;

    @ActionType(Transition)
    public HomeScreen goHome(){
        return perform(p->{
            linkHome.click();
        });
    }

    @ActionType(Transition)
    public FindOwnersScreen goFindOwners(){
        return perform(p -> {
            linkFindOwners.click();
        });
    }

    @ActionType(Transition)
    public LoginScreen goFindOwnersUnauthorized(){
        return perform(p -> {
            linkFindOwners.click();
        });
    }

    @ActionType(Transition)
    public VeterinariansScreen goVeterinarians(){
        return perform(p->{
            linkVeterinarians.click();
        });
    }

    @ActionType(Transition)
        public ErrorScreen goError(){
            return perform(p->{
                linkError.click();
            });
        }

    @ActionType(Transition)
        public InboxScreen goInbox(){
            return perform(p->{
                linkInbox.click();
            });
        }
}

