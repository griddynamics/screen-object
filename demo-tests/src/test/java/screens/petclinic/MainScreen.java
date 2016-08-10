package screens.petclinic;


import al.qa.so.BaseScreen;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"http://localhost:8080/"})
public class MainScreen extends BaseScreen {

    @Trait
    @FindBy(xpath = "//h2")
    private SelenideElement labelWelcome;
}

