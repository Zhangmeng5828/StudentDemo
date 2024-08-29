package cn.itcast.day_6.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/11/下午5:10
 */
public class Demo_随机打乱字符内容 {
    public static void main(String[] args){
        // 键盘录入任意字符串 打乱顺序输出

        // 1.键盘录入
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();


        /*// 2.将字符串转换为字符数组
        char[] chars = str.toCharArray();

        // 3.打乱字符数组
        for (int i = 0; i < chars.length; i++) {
            int index = (int) (Math.random() * chars.length);
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        // 4.将字符数组转换为字符串
        String result = new String(chars);*/


        // 4.调用方法
        String result = randomString(str);

        // 5.输出结果
        System.out.println(result);
    }
    public static String randomString(String str){
        //1.将字符串转换为字符数组
        char[] chars = str.toCharArray();
        //2.打乱字符数组
        for (int i = 0; i < chars.length; i++) {
            int index = (int) (Math.random() * chars.length);
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }
        //3.将字符数组转换为字符串
        return  new String(chars);
    }
}
