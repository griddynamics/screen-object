package al.qa.so.hooks;

import al.qa.so.utils.Utils;
import org.slf4j.Logger;

/**
 * @author Alexey Lyanguzov.
 */
public class DefaultHooks {
    private static final Logger LOG = Utils.getLogger();

    public static final Runnable hook1 = ()->{
        LOG.debug("");
    };

}
