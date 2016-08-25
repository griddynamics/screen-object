package al.qa.so.anno;

import al.qa.so.UriComparisonStrategyType;
import al.qa.so.utils.url.UriComparator;
import al.qa.so.utils.url.UrlComparisonStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alexey Lyanguzov.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ScreenParams {
    String[] urls();
    UriComparisonStrategyType strategyType() default UriComparisonStrategyType.Plain;
    Class<? extends UrlComparisonStrategy> urlComparisonStrategy() default UriComparator.CompareAll.class;
}
