package petclinic.testng;


import al.qa.so.SO;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import petclinic.model.User;
import petclinic.screens.PetClinicScreens;

import static al.qa.so.SO.navigateTo;
import static al.qa.so.SO.onScreen;
import static petclinic.screens.PetClinicScreens.*;

public class RunPetClinicTest {
    private User user;

    @BeforeSuite
    private void doit(){
        user = new User("user", "password");

        Configuration.baseUrl = "http://localhost:8080";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";

        SO.addScreens(PetClinicScreens.class);
    }

    @Test
    public void selenideExamplePageObjectTest() throws InterruptedException {
        navigateTo(HOME_SCREEN);
        onScreen(HOME_SCREEN).login();
        onScreen(LOGIN_SCREEN).loginFromHomeScreen(user);
        onScreen(HOME_SCREEN).navigation().goFindOwners();
        onScreen(FIND_OWNERS_SCREEN).findOwner("Franklin");
        onScreen(OWNER_INFORMATION_SCREEN).editOwner();
        onScreen(EDIT_OWNER_SCREEN).updateOwner();
        onScreen(OWNER_INFORMATION_SCREEN).addNewPet();
        onScreen(ADD_NEW_PET_SCREEN).cancel();
        onScreen(OWNER_INFORMATION_SCREEN).navigation().goVeterinarians();
        onScreen(VETERINARIANS_SCREEN).navigation().goError();
        onScreen(ERROR_SCREEN).navigation().goInbox();
    }
}
