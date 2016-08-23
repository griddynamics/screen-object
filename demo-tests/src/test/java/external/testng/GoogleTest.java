package external.testng;

import al.qa.so.SO;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;
import external.screens.GoogleScreens;

import static al.qa.so.SO.navigateTo;
import static al.qa.so.coverage.Model.COVERAGE;
import static external.screens.GoogleScreens.SEARCH_PAGE;

/**
 * @author Alexey Lyanguzov.
 */
public class GoogleTest {
    @BeforeSuite
    private void doit(){
        Configuration.baseUrl = "https://www.google.ru";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";

        SO.addScreens(GoogleScreens.class);
//        SO.CONFIG.dryRun = true;
//        SO.CONFIG.reportWebDriverInteraction = false;
    }

    @BeforeMethod
    private void initStepRecorder(){
        SO.getStepRecorder().init();
    }
    @AfterMethod
    private void printRecordedSteps(){
        SO.getStepRecorder().printSteps();
    }

    @AfterSuite
    private void after1(){
        System.out.println(COVERAGE);
//        COVERAGE.report();
    }

    @Test(enabled = false)
    public void selenideExamplePageObjectTest(){
        navigateTo(SEARCH_PAGE)
            .search("selenide")
            .ensure(c->{c
                .returnedResultsCount(10)
                .firstSearchResults("Selenide: лаконичные и стабильные UI тесты на Java");
            });
    }

}
