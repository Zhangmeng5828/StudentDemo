package cn.itcast.day_4.Test;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:09
 */



//带返回值方法的定义和调用
public class Test3 {

    public static void main(String[] args) {

        // 直接调用
        getSum(10,20,40);

        // 赋值调用
        double sum = getSum(10,20,40);
        System.out.println(sum);


        // 输出调用
        System.out.println(getSum(10,20,40));




    }

    public static double getSum(double a, double b, double c) {
        return a + b + c;
    }
}
