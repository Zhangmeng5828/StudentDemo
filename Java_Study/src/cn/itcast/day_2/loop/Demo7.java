package cn.itcast.day_2.loop;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午10:13
 */
public class Demo7 {
    public static void main(String[] args) {


        // break : （如果出现在循环中）退出当前循环
        // continue : 跳过本次循环    进入下次循环

        //  循环录入5门课的成绩 一旦分数为负数  立即停止录入

        Scanner sc = new Scanner(System.in);

        /*for (int i =0; i<5; i++){
            System.out.println("请输入第"+(i+1)+"门课的成绩");
            int score = sc.nextInt();
            if (score < 0){
                System.out.println("数据有误,退出！");
                break;
            }
        }*/


        // 计算分数大于80分的学生比例

        /*int count = 0;

        for (int i =0; i<5; i++){
            System.out.println("请输入第"+(i+1)+"门课的成绩");
            int score = sc.nextInt();
            if (score < 80){
                continue;
            }
            // 如果分数小于80分不会执行下面代码
            count ++;
        }

        double rate = count / 5.0;
        System.out.println(rate);*/


        // 双重循环
        // 录入2个班 每个班5名同学的成绩 一旦出现负数跳出循环
        // 外层循环代表班级

        for (int i =0; i<2; i++){
            System.out.println("请输入第"+ (i+1) +"个班级成绩");
            // 内层循环代表每个班级学生成绩
            for (int j =0; j<5; j++){
                System.out.println("请输入第"+(j+1)+"门课的成绩");
                int score = sc.nextInt();
                if (score < 0){
                    System.out.println("数据有误,退出！");
                    break;
                }
            }
        }
    }
}
