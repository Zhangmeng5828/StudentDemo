package cn.itcast.day_3;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午9:37
 */
public class ArrTest1 {
    public static void main(String[] args) {

        // 定义一个数组，存储50个学生姓名
        // 学生报到后添加

        /*String[] arr = new String[50];


        Scanner name = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入学生名字: ");
            arr[i] = new Scanner(System.in).nextLine();


        }*/



        // 生成10个1~100之间的随机数存入数组
        // 求出所有数据的和
        // 求所有数据的平均数
        // 统计有多少个数据比平均值小

        int[] arr = new int[10];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }


        int sum = 0;
        // 求出所有数据的和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和:"+sum);


        // 求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("所有数据的平均数:"+avg);


        // 统计有多少个数据比平均值小

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("数组中有"+count+"个数据比平均值小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
