package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午9:36
 */
public class Demo5 {
    public static void main(String[] args) {

        // 泽林 Java 成绩大于90分 ， 并且音乐成绩大于80分时   或者Java成绩等于100分音乐成绩大于70分时， 获得奖励


        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入Java成绩:");
        int score = scanner.nextInt();
        System.out.println("请输入音乐成绩:");
        int mscore = scanner.nextInt();



        // 语法： if(表达式的结果必须是boolean类型){}
        //如果表达式的结果为true则执行{}中的程序
        // 逻辑运算符的执行优先级 ： && > || > !
        // 运算符优先级 ：算术运算符 > 比较运算符 > 逻辑运算符 > 赋值运算符
        if (score > 90 && mscore > 80 || score == 100 && mscore > 70) {

            System.out.println("奖励ip999");
        }
            
    }
}

