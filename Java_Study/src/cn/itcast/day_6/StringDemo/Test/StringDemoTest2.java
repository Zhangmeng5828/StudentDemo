package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/06/下午8:23
 */
public class StringDemoTest2 {
    public static void main(String[] args) {


        /**
         * 需求：键盘录入一个字符串，
         * 统计该字符串中大写字母字符，
         * 小写字母字符，数字字符出现的次数(不考虑其他字符)
         */
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        /*// 2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // i表示字符串中的索引
            char ch = str.charAt(i);
            System.out.println(ch);*/


        // 2.看见统计次数，定义计数器
        int bigWordCount = 0;
        int smallWordCount = 0;
        int numberCount = 0;


        // 3.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // i表示字符串中的索引
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigWordCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallWordCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        // 4.输出结果
        System.out.println("大写字母字符出现的次数是：" + bigWordCount);
        System.out.println("小写字母字符出现的次数是：" + smallWordCount);
        System.out.println("数字字符出现的次数是：" + numberCount);
    }
}
