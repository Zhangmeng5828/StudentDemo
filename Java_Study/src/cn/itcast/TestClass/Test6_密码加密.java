package cn.itcast.TestClass;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/23/上午12:48
 */
public class Test6_密码加密 {
    public static void main(String[] args) {
        /*需求：
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则：
        先得到每位数，然后每位数都加5，再对10求余，最后将所有数字反转，得到一串新数
        * */



        // 获取数字长度
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的原始密码:");
        int number = sc.nextInt();
        int count = 0;
        int temp1 = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        // 1.把整数里的每一位数放到数组中
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp1 != 0) {
            // 获取数组的个一位
            int ge = temp1 % 10;
            // 去掉右边获得的个位
            temp1 = temp1 / 10;
            arr[index] = ge;
            index--;
        }


        // 2.加密
        // 每位数加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        // 再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        // 将所有数字反转
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        // 把数组里面的每位数进行拼接，变成加密之后的结果
        int number1 = 0;
        for (int i = 0; i < arr.length; i++) {
            number1 =number1 * 10 + arr[i];
        }
        System.out.println("你的加密密码为:"+number1);
    }
}
