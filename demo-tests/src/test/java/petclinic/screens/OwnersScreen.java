package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//FIXME: Add wildcard comparator
@ScreenParams(urls = {"/"})
public class OwnersScreen extends NavigationBarScreen {
    
    @Trait
    @FindBy(xpath = "//h2[text()='Owners']")
    private SelenideElement title;
}
