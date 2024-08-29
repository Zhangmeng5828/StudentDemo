package cn.itcast.day_6.StringDemo;



import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/06/下午7:51
 */
public class StringDemo3 {
    public static void main(String[] args){
        // 1.假设我现在在键盘录入一个ABC
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next(); // ABC
        // 2.代码中在定义一共个字符串"ABC"
        String str2 = "ABC";
        // 3.比较两个字符串的内容是否相同
        boolean result = str1.equals(str2);
        System.out.println(result); // true
        System.out.println(str1 == str2); // false
    }
}
