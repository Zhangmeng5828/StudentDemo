package cn.itcast.day_6.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/11/下午11:11
 */
public class Demo_两个字符串形式整数相乘 {
    public static void main(String[] args) {
        // 键盘输入两个字符串形式的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串形式的整数：");
        String s1 = sc.next();
        System.out.println("请输入第二个字符串形式的整数：");
        String s2 = sc.next();
        String result = multiply(s1,s2);
        System.out.println("两个字符串形式的整数相乘的结果是：" + result);
    }
    public static String multiply(String s1,String s2){
        if (s1 == null || s2 == null) {
            return null;
        }else if (s1.charAt(0)=='-' && s2.charAt(0) == '-'){
            return multiply(s1.substring(1),s2.substring(1));
        }else if (s1.charAt(0) == '-'){
            return "-" + multiply(s1.substring(1),s2);
        }else if (s2.charAt(0) == '-'){
            return "-" + multiply(s1,s2.substring(1));
        }else {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);
            return String.valueOf(num1 * num2);
        }
    }
}
