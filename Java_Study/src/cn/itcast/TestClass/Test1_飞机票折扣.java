package cn.itcast.TestClass;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/下午10:12
 */
public class Test1_飞机票折扣 {
    public static void main(String[] args) {
        /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
            按照如下规则计算机票价格：旺季（5~10月）头等舱9折，经济舱8.5折、淡季（11月到来年4月份）头等舱7折，经济舱6.5折。
        * */

        // 分析：
        // 键盘录入 机票原价    月份  头等舱或经济舱。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double ticket = sc.nextDouble();
        System.out.println("请输入当前月份:");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱    1 经济舱:");
        int seat = sc.nextInt();
        
        
        
        
        // ctrl + alt + M   自动抽取方法
        // 2.判断     月份  淡季  旺季
        if (month >= 5 && month <= 10) {
            // 旺季
            // 3.判断     机票是头等舱或经济舱
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        }else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            // 3.判断     机票是头等舱或经济舱
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else {
            //表示键盘录入数据不合法
            System.out.println("键盘录入数据不合法");
        }
        // 4.根基实际情况计算出对应价格
        System.out.println(ticket);
    }


    //  自动抽取方法
    private static double getTicket(int seat, double ticket, double x, double x1) {
        if (seat == 0) {
            // 头等舱
            ticket = ticket * x;
        } else if (seat == 1) {
            // 经济舱
            ticket = ticket * x1;
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

    // 1.我要干嘛       根据头等舱和折扣计算最总票价

    // 2.我干这件事，需要什么才能完成     原价      舱位      头等舱的折扣  经济舱的折扣

    // 3.方法的调用处是否要继续使用这个结果      需要
    
    
    
    // 手写方法
    /*public static double getPrice(double ticket, int seat,double v0, double v1) {
        // 3.判断     机票是头等舱或经济舱
        if (seat == 0) {
            // 头等舱
            ticket = ticket * v0;
        }else if (seat == 1) {
            // 经济舱
            ticket = ticket * v1;
        }else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }*/

}
