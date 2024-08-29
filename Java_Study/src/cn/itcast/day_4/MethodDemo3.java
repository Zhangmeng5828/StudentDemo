package cn.itcast.day_4;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午10:47
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        // 方法调用

        getSum(30,34);


    }

    // 定义一个方法
   public static void getSum(int num1,int num2) {

        int sum = num1 + num2;
        System.out.println(sum);
   }



}
