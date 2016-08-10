package testng;


import al.qa.so.SO;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import screens.PetClinicScreens;

import static al.qa.so.SO.navigateTo;
import static screens.PetClinicScreens.MAIN_SCREEN;

public class RunPetClinicTestIT {
    @BeforeSuite
    private void doit(){
        Configuration.baseUrl = "";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";

        SO.addScreens(PetClinicScreens.class);
    }


    @Test
    public void selenideExamplePageObjectTest() throws InterruptedException {
            navigateTo(MAIN_SCREEN);
    }
}
