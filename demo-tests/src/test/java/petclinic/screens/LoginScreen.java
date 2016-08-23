package petclinic.screens;


import al.qa.so.anno.ActionType;
import al.qa.so.anno.ScreenParams;
import al.qa.so.anno.Trait;
import org.openqa.selenium.support.FindBy;
import petclinic.model.User;
import petclinic.modules.LoginFormModule;

import static al.qa.so.ActAs.Transition;

@ScreenParams(urls = {"/login"})
public class LoginScreen extends NavigationBarScreen {

    @Trait
    @FindBy(xpath = "//div[contains(@class,'starter-template')]")
    private LoginFormModule loginForm;

    @ActionType(Transition)
    public HomeScreen loginFromHomeScreen(User user){
        return perform(p->{
            loginForm.login(user);
        });
    }


}
