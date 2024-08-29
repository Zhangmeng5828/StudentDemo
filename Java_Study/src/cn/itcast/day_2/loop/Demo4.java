package cn.itcast.day_2.loop;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:56
 */
public class Demo4 {
    public static void main(String[] args) {
        // 统计6门课程的平均分
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i =0; i<6; i++){
            System.out.println("请输入第"+(i+1)+"门课程的分数");
            int score = sc.nextInt();
            sum += score;
        }

        double avg = (double) sum/6;
        System.out.println(avg);

    }
}
