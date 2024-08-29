package cn.itcast.TestClass;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/下午11:59
 */
public class Test5_评委打分 {
    public static void main(String[] args) {
        /*在歌唱比赛中， 有6名评委给选手打分，分数范围在[0 ~ 100]之间的整数。
        选手的最后得分为： 去掉一个最高分和最低分 剩下4名评委的分数取平均分
        * */

        // 分析：
        // 1.定义一个数组，用来存储6名评委的打分（0 ~ 100）
        int[] scoresArr = getScore();
       /* for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }*/
        // 2.求出数组中的最大值
        int max = getMaxScore(scoresArr);
        // 3.求出数组中的最小值
        int min = getMinScore(scoresArr);
        // 4.求出数组中6个分数的总和
        int sum = getSum(scoresArr);
        // 5.求平均值(总和 - 最小值 - 最大值) / 4
        double avg = getAvg(sum, max, min, scoresArr);

        System.out.println(avg);

    }


    // 1.我要干嘛       定义一个数字，用来存储6名评委的打分
    // 2.我需要什么  都不需要
    // 3.干完这件事要返回值吗 需要
    public static int[] getScore() {
        // 定义数组
        int[] scores= new int[6];
        //使用键盘录入分数（0 ~ 100）
        for (int i = 0; i < scores.length;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("成绩超出范围，继续录入，当前的i为："+i);
            }
        }
        return scores;
    }

    // 1.我要干嘛      求最大值
    // 2.我需要什么  数组
    // 3.干完这件事要返回值吗 需要
    public static int getMaxScore(int[] scoresArr) {
        int max = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] > max) {
                max = scoresArr[i];
            }
        }
        return max;
    }


    // 1.我要干嘛      求最小值
    // 2.我需要什么  数组
    // 3.干完这件事要返回值吗 需要
    public static int getMinScore(int[] scoresArr) {
        int min = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] < min) {
                min = scoresArr[i];
            }
        }
        return min;
    }

    // 1.我要干嘛      求总和
    // 2.我需要什么  数组
    // 3.干完这件事要返回值吗 需要
    public static int getSum(int[] scoresArr) {
        int sum = 0;
        for (int i = 0; i < scoresArr.length; i++) {
            sum += scoresArr[i];
        }
        return sum;
    }

    // 1.我要干嘛      求平均值
    // 2.我需要什么  数组  最大值     最小值     总和
    // 3.干完这件事要返回值吗 需要
    public static double getAvg(int sum, int max, int min, int[] scoresArr) {
        double avg = (double) (sum - max - min) / (scoresArr.length-2);
        return avg;
    }

}
