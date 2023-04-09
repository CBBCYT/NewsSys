import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 1. @Author: lblz
 2. @Description: 处理器
 3. @Date: 2022/5/5 17:02
 */
public class AnnotationProcessor {
    /**
     * @Date: 2022/5/5 17:35
     * @Description:
     * @param: cl:使用了注解的类对象
     * @Return: null
     */
    public static void operationAnnotation(Class<?> cl) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取类上私有字段;
        Field[] fields = cl.getDeclaredFields();
        StringBuffer stringBuffer = new StringBuffer();
        Arrays.stream(fields).forEach(p->{
            AnimalAnnotation annotation = p.getAnnotation(AnimalAnnotation.class);
            if(annotation.value().length()>0){
                stringBuffer.append("我家小狗叫:"+annotation.value());
            }
            if(annotation.hairColor().length()>0){
                stringBuffer.append("\t它的毛发是:"+annotation.hairColor());
            }
        });
        //获取方法
        Method method = cl.getDeclaredMethod("getDog", String.class);
        //获取方法上的注解
        AnimalAnnotation annotation = method.getAnnotation(AnimalAnnotation.class);
        if(annotation.id() != -1){
            stringBuffer.append("\t编号为:"+annotation.id());
        }
        //执行getDog方法
        method.invoke(cl.newInstance(),stringBuffer.toString());
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        operationAnnotation(Dog.class);
    }
}