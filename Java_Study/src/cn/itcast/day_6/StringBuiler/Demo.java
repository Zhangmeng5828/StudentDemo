package cn.itcast.day_6.StringBuiler;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午3:46
 */
public class Demo {
    public static void main(String[] args){
        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        sb.append("hello");
        sb.append("world");
        sb.append(" I love ");
        sb.append("java");



        // 反转
        sb.reverse();

       // 获取长度
        int length = sb.length();

        // 3.输出字符串
        System.out.println(sb+""+""+length);



        // 4.链式编程
        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello").append("world").append("java");

        // 5.将StringBuilder转换为String
        String s = sb1.toString();
        System.out.println(s);

        // 6.将String转换为StringBuilder
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);
    }
}
