package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午9:36
 */
public class Demo7 {
    public static void main(String[] args) {

        // 成绩测试： 成绩大于等于80 优秀   大于等于60 中等  小于60 差

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考试成绩:");
        int score = scanner.nextInt();

        // 语法： if(表达式的结果必须是boolean类型){}
        //如果表达式的结果为true则执行{}中的程序

        if (score >= 80) {
            System.out.println("优秀");
        }else if (score >= 60) {
            System.out.println("中等");
        }else {
            System.out.println("差");
        }


            
    }
}

