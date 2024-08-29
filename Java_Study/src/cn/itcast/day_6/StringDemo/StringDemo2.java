package cn.itcast.day_6.StringDemo;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午9:35
 */
public class StringDemo2 {
    public static void main(String[] args) {
        // 1.使用直接赋值的方式创建字符串对象
        String s1 = new String("helloworld");
        String s2 = "helloWorld";

        //2. ==号比较
        // 基本数据类型 ： 比较的是数据值
        // 引用数据类型 ： 比较的是地址值

        System.out.println(s1 == s2); //false

        // 3. equals方法比较
        boolean result1 = s1.equals(s2);
        System.out.println(result1); //false


        //4.比较字符串内容是否相同，忽略大小写
        // 只能忽略字符串中的英文大小写，不能忽略数字大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2); //true
    }
}
