package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午9:27
 */
public class Demo3 {
    public static void main(String[] args) {
        //  表达式 ？ 值1 : 值2   (表达式的值为true 结果值1    为false  结果值2)

        //  钱大亨考试考了100分 奖励  小于100分  惩罚

        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试名字:");
        String name = input.next();
        System.out.println("请输入考试分数:");
        int score = input.nextInt();
        String result = score == 100 ? "奖励":"惩罚";
        System.out.println(result);
    }
}
