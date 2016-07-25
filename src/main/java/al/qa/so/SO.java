package al.qa.so;

import al.qa.so.exc.TestExecutionException;
import al.qa.so.utils.recorder.StepRecorder;
import al.qa.so.utils.Utils;

import java.util.Arrays;

/**
 * @author Alexey Lyanguzov.
 */
@SuppressWarnings("unused")
public class SO {
    public static final Config CONFIG = new Config();

    @SuppressWarnings("unchecked")
    public static <T extends BaseScreen> void addScreens(Class<? extends ScreenRegister> registerClass) {
        Arrays.stream(registerClass.getFields()).forEach(field -> {
            Manager.register((Class<T>)Utils.getStaticFieldValue(field));
        });
    }

    public static <T extends BaseScreen> T navigateTo(Class<T> screenClass)  {
        return Manager.onScreen(screenClass, true);
    }

    public static <T extends BaseScreen> T onScreen(Class<T> screenClass)  {
        return Manager.onScreen(screenClass, false);
    }

    public static <T extends BaseScreen> T currentScreen(){
        return Manager.getCurrentScreen();
    }

    public static void failTest(String msg, Object...args){
        String message = (args.length == 0) ? msg : String.format(msg, args);
        throw new TestExecutionException(message);
    }

    public static String fieldName(int key){
        return Manager.getFieldName(key);
    }

    public static StepRecorder getStepRecorder(){
        return Manager.getStepRecorder();
    }

}
