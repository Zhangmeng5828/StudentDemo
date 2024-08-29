package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/07/下午7:36
 */
public class StringDemoTest5_金额转换 {
    public static void main(String[] args){
        /**
         * 将数字123456789转换为
         * 壹亿贰仟叁佰肆拾伍万陆仟柒佰捌拾玖
         */


        // 1.键盘录入金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money ;

        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 999999999){

                break;
            }else {
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        // 2.获得money里面的每一位数字
        while (true){
            // 从右到左获取数据，每次获取一位
            int ge = money % 10;
            // 3.将数字转换成中文读法
            moneyStr = moneyToChinese(ge) + moneyStr; //
            // 去掉最后一位
            money = money / 10;



            // 如果数字上的每一位全都获取到了，那么money记录的就是0，循环结束
            if (money == 0){
                break;
            }
        }

        // 补齐零
        int count = 9 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        // 4.插入单位
        String[] arr = {"亿","仟","佰","拾","万","仟","佰","拾","元"};

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result+ c  +  arr[i];
        }
        System.out.println(result);
    }
    public static String moneyToChinese(int number){
        // 定义数组，让数字与中文读法一一对应
        String[] num = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        // 返回结果
        return num[number];
    }
}

