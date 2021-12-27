package hw_my_logger;

import java.lang.annotation.*;

/**
 * Класс Log
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {

}