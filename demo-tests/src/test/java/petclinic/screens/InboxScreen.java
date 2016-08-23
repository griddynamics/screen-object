package petclinic.screens;

import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@ScreenParams(urls = {"/messages"})
public class InboxScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//a[@href='/messages/?form']")
    private SelenideElement linkCreateMessage;
}
