package external.screens;

import al.qa.so.ScreenRegister;
import external.screens.google.GoogleResultsPage;
import external.screens.google.GoogleSearchPage;
import external.screens.google.UnvisitedGoogleScreen;

/**
 * @author Alexey Lyanguzov.
 */
public class GoogleScreens implements ScreenRegister{

    public static Class<GoogleResultsPage> SEARCH_RESULTS_PAGE = GoogleResultsPage.class;
    public static Class<GoogleSearchPage> SEARCH_PAGE = GoogleSearchPage.class;
    public static Class<UnvisitedGoogleScreen> UNVISITED_PAGE = UnvisitedGoogleScreen.class;

}
