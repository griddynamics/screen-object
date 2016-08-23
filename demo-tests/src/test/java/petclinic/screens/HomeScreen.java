package petclinic.screens;


import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.modules.NavigationBarModule;

import static al.qa.so.ActAs.Transition;

@ScreenParams(urls = {"/"})
public class HomeScreen extends NavigationBarScreen {;

    @FindBy(xpath = "//body/div[contains(@class,'navbar')]")
    private NavigationBarModule navigationBar;

    @FindBy(xpath = "//h2")
    private SelenideElement labelWelcome;

    @Trait
    @FindBy(xpath = "//img[@src='/images/pets.png']")
    private SelenideElement imgPets;

    @FindBy(xpath = "//a[@href='/login']")
    private SelenideElement buttonLogin;

    @FindBy(xpath = "//button[@type='submit']")
    private SelenideElement buttonSignUp;

    @ActionType(Transition)
    public LoginScreen login(){
        return perform(p->{
            navigationBar.goHome();
            buttonLogin.click();
        });
    }

    public NavigationBarModule navigation() {
        return navigationBar;
    }
}

