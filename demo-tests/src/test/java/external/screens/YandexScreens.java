package external.screens;

import al.qa.so.ScreenRegister;
import external.screens.yandex.ImageSearchResultsScreen;
import external.screens.yandex.ImagesScreen;
import external.screens.yandex.MainScreen;
import external.screens.yandex.SearchResultsScreen;

/**
 * @author Alexey Lyanguzov.
 */
public class YandexScreens implements ScreenRegister{

    public static Class<MainScreen> MAIN_SCREEN = MainScreen.class;
    public static Class<ImagesScreen> IMAGES_SCREEN = ImagesScreen.class;
    public static Class<SearchResultsScreen> SEARCH_RESULTS_SCREEN = SearchResultsScreen.class;
    public static Class<ImageSearchResultsScreen> IMAGE_SEARCH_RESULTS_SCREEN = ImageSearchResultsScreen.class;

}
