package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午10:17
 */
public class Demo9 {
    public static void main(String[] args) {
        // 随机数 来自Math类
        int computer = (int)(Math.random()*3+1);

        //公式 : Math.random() *(最大值-最小值) + 最小值


        // 随机猜拳     剪刀  石头  布
        // 1.写出 1~3 之间的随机数
        System.out.println("你出拳: 1:石头 2:剪刀 3:布\n");
        int user =new Scanner(System.in).nextInt();
        if(computer == user){
            System.out.println("平局");
        } else if (computer==1 && user ==2 ||
                computer == 2 && user ==3 ||
                computer == 3 && user == 1
        ) {
            System.out.println("你输了");
        }else {
            System.out.println("你赢了");
        }




        /**
         *  猜100以内的数
         *  只有10次机会
         * */
        int num = (int)(Math.random()*100+1);
        System.out.println("请输入0~100以内的数");
        int num1 =new Scanner(System.in).nextInt();
        int i =10;
        while (true){
                if ( i == 0 ) {
                    System.out.println("你没机会了");
                    break;
                }else if (num1 > num ) {
                    System.out.println("数大了");
                    System.out.println("你还有:"+ --i +"次机会");
                    num1 = new Scanner(System.in).nextInt();
                }else if (num1 <num){
                    System.out.println("数小了");
                    System.out.println("你还有:"+ --i +"次机会");
                    num1 = new Scanner(System.in).nextInt();
                }else{
                    System.out.println("恭喜你猜对了");
                    break;
                }
        }

    }
}
