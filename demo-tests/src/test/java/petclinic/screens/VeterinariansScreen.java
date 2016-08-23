package petclinic.screens;


import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.modules.NavigationBarModule;

@ScreenParams(urls = {"/vets/list.html"})
public class VeterinariansScreen extends NavigationBarScreen {

    //FIXME: move it to NavigationBarScreen class
    @FindBy(xpath = "//body/div[contains(@class,'navbar')]")
    private NavigationBarModule navigationBar;

    @Trait
    @FindBy(xpath = "//h2[text()='Veterinarians']")
    private SelenideElement title;

    public NavigationBarModule navigation() {
        return navigationBar;
    }
}
