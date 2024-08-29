package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午9:36
 */
public class Demo4 {
    public static void main(String[] args) {

        // 钱大亨考试成绩大于90   奖励iphone99

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考试成绩:");
        int score = scanner.nextInt();

        // 语法： if(表达式的结果必须是boolean类型){}
        //如果表达式的结果为true则执行{}中的程序

        if (score >= 90) {
            System.out.println("奖励一台iPhone99");
            
        }
    }
}
