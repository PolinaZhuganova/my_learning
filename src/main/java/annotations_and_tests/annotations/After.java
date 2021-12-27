package annotations_and_tests.annotations;

import java.lang.annotation.*;

/**
 * Класс After
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface After {
}