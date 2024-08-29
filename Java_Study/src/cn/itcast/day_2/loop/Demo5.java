package cn.itcast.day_2.loop;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:56
 */
public class Demo5 {
    public static void main(String[] args) {
        // 打印加法表
        //Scanner sc = new Scanner(System.in);
        int k = 6;
        for (int i =0; i<6; i++){
            System.out.println(i+" + "+k+" = "+(i+k));
            k-=1;
        }


    }
}
