package annotations_and_tests.annotations;

import java.lang.annotation.*;

/**
 * Класс Before
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Before {
}