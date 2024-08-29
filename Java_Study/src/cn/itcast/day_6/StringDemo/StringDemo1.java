package cn.itcast.day_6.StringDemo;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午9:35
 */
public class StringDemo1 {
    public static void main(String[] args) {
        // 1.使用直接赋值的方式创建字符串对象
        String s1 = "hello";
        System.out.println(s1);

        // 2.使用new关键字创建字符串对象
        String s2 = new String();
        System.out.println("@"+ s2 +"#");

        // 3.使用new关键字和字符串常量创建字符串对象
        String s3 = new String("hello");
        System.out.println("@"+ s3 +"#");

        // 4.使用new关键字和字符数组创建字符串对象
        // 需求：修改字符串中的内容
        // 思路：将字符串转换为字符数组，修改字符数组中的内容，再将字符数组转换为字符串
        char[] arr = {'h','e','l','l','o'};
        String s4 = new String(arr);
        System.out.println(s4);

        // 5.使用new关键字和字节数组创建字符串对象
        // 应用场景：以后在网络当中传输的数据都是字节，
        // 将字符串转换为字节数组，再传输，接收方将字节数组转换为字符串
        byte[] arr1 = {97,98,99,100,101};
        String s5 = new String(arr1);
        System.out.println(s5);
    }
}
