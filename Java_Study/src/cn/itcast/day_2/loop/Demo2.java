package cn.itcast.day_2.loop;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:45
 */
public class Demo2 {
    public static void main(String[] args) {

        // do -while :  特点  先执行循环操作 再判断循环条件
        //  合格  如果不合格，则继续编写

        Scanner input = new Scanner(System.in);

        String string ;
        do {
            System.out.println("上午阅读教材   学习部分理论 下午上机编程，掌握代码部分");
            System.out.println("老师我合格了吗？y/n");
            string = input.nextLine();
        }while ("n".equals(string));


        //  比较while循环和do-while循环
        //  相同点: 都是用来循环执行任务
        //  不同点: while是先判断后执行   do-while是先执行后判断（至少执行一次）

    }
}
