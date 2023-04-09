/**
 * @Author: lblz
 * @Description:
 * @Date: 2022/5/5 16:55
 */
public class Dog {
    /**
     * 姓名
     */
    @AnimalAnnotation("小黄") //如果不加注解属性 则默认是value,
    private String name;

    /**
     * 颜色
     */
    @AnimalAnnotation(hairColor = "黄色")
    private String color;

    @AnimalAnnotation
    public void getDog(String dogData){
        System.out.println(dogData);
    }
}