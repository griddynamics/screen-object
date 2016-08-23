package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import petclinic.modules.NavigationBarModule;


@ScreenParams(urls = {"/oups.html"})
public class ErrorScreen extends NavigationBarScreen {

    //FIXME: move it to NavigationBarScreen class
    @FindBy(xpath = "//body/div[contains(@class,'navbar')]")
    private NavigationBarModule navigationBar;

    public NavigationBarModule navigation() {
        return navigationBar;
    }

    @Trait
    @FindBy(xpath = "//h2[normalize-space(text())=\"We're sorry!\"]")
    private SelenideElement title;
}
