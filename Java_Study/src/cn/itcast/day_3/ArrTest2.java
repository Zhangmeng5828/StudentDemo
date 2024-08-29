package cn.itcast.day_3;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午9:37
 */
public class ArrTest2 {
    public static void main(String[] args) {
        // 定义一个数组，存入1 2 3 4 5 ，交换索引所对应的值


        int[] arr = new int[]{1,2,3,4,5};

        int temp;


        for (int i = 0,j = arr.length -1; i < j; i++ ,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();





        // 打乱数据中的所有数据的顺序

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            // 生成一个随机索引
            int randomIndex = rand.nextInt(arr.length);

            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
