package petclinic.testng;


import al.qa.so.SO;
import com.codeborne.selenide.Configuration;
import petclinic.screens.PetClinicScreens;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static al.qa.so.SO.navigateTo;
import static petclinic.screens.PetClinicScreens.MAIN_SCREEN;

public class RunPetClinicTest {
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
