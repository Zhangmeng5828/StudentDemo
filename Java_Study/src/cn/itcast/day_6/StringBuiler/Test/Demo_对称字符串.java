package cn.itcast.day_6.StringBuiler.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午4:09
 */
public class Demo_对称字符串 {
    public static void main(String[] args){
        //涉及字符串的反转和字符串的拼接时使用StringBuilder



        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        // 2.反转键盘录入的字符串
        String reverse = new StringBuilder(str).reverse().toString();

        // 3.比较键盘录入的字符串和反转后的字符串是否相等
        if(str.equals(reverse)){
            System.out.println("是回文字符串");
        }else{
            System.out.println("不是回文字符串");
        }

    }
}
