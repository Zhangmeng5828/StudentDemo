package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午7:40
 */
public class Demo10 {
    public static void main(String[] args) {
        //钱大亨 参加班级比帅比赛
        //第一名   奖励劳斯莱斯优惠券5万元
        //第二名   奖励iPhone笔记本购物券张满三块减10元
        //第三名   奖励10万元刮刮乐抽奖一次

        Scanner input = new Scanner(System.in);

        System.out.println("钱大亨的名次:");
        int mingci = input.nextInt();

        if (mingci == 1) {
            System.out.println("第一名   奖励劳斯莱斯优惠券5万元");
        }else if (mingci == 2) {
            System.out.println("第二名   奖励iPhone笔记本购物券张满三块减10元");
        }else if (mingci == 3) {
            System.out.println("第三名   奖励10万元刮刮乐抽奖一次");
        }else {
            System.out.println("无奖励");
        }


        //  使用Switch来优化 Switch只能等值判断    不能范围判断
        //  括号里面的数据类型支持: int    String  char    byte    short   枚举
        //  Java特有的 Switch穿透性   如果case的后面没有break    那么程序会执行下一个case 直到遇到break为止
        switch (mingci) {
            case 1:
                System.out.println("第一名   奖励劳斯莱斯优惠券5万元");
                break;
            case 2:
                System.out.println("第二名   奖励iPhone笔记本购物券张满三块减10元");
                break;
            case 3:
                System.out.println("第三名   奖励10万元刮刮乐抽奖一次");
                break;
            default:
                System.out.println("无奖励");
                break;
        }


        //函数式编程（Java8的新特性）
        /*
        switch (mingci) {
            case 1 -> {System.out.println("第一名   奖励劳斯莱斯优惠券5万元");}
            case 2 -> {System.out.println("第二名   奖励iPhone笔记本购物券张满三块减10元");}
            case 3 -> {System.out.println("第三名   奖励10万元刮刮乐抽奖一次");}
            default -> { System.out.println("无奖励");}
        }*/


        Scanner input1 = new Scanner(System.in);
        System.out.println("请输入今天星期几:");
        String week = input1.nextLine();
        switch (week) {
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                System.out.println("上课");
                break;
            default:
                System.out.println("en...");
                break;
        }
    }
}

