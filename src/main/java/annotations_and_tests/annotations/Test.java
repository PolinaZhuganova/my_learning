package annotations_and_tests.annotations;

import java.lang.annotation.*;

/**
 * Класс Test
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}