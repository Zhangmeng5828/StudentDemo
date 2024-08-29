package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/上午9:25
 */
public class StringDemoTest3_手机号屏蔽 {
    public static void main(String[] args) {
        // 1，获取一个手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String phone = sc.next();

        // 2.截取手机号前三位和后四位
        String start = phone.substring(0,3);

        String end = phone.substring(7);

        // 3.拼接
        String result = start + "****" + end;

        // 4.输出
        System.out.println(result);

    }
}
