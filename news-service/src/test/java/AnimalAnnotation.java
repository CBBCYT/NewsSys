import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lblz
 * @Description: 注解定义
 * @Date: 2022/5/5 14:35
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalAnnotation {

    String value() default " "; //因为默认值不能用null,所以可以选用一些特殊符号作为判断标识

    int id() default -1;

    String hairColor() default " ";
}