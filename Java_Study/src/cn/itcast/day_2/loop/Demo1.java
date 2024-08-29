package cn.itcast.day_2.loop;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:32
 */
public class Demo1 {
    public static void main(String[] args) {
        //  循环四大特点:
        //  循环变量
        //  循环操作
        //  循环条件
        //  循环变量的更新（出口）

        /**
         * 老师每天检查学生学习任务是否合格。
         * 如果不合格，则继续进行
         * 老师每天安排的学习任务：上午阅读教材   学习部分理论
         * 下午上机编程，掌握代码部分
         */

        Scanner input = new Scanner(System.in);
        System.out.println("学习任务合格了吗？ ");
        String result =input.next();
        while (result.equals("不合格")){
            // 循环操作 完成学习任务
            System.out.println("上午阅读教材   学习部分理论 下午上机编程，掌握代码部分");
            System.out.println("学习任务合格了吗？ ");
            result = input.next();
        }

    }
}
