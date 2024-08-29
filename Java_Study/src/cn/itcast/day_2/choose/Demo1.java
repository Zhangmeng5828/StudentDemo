package cn.itcast.day_2.choose;

/**
 * @Author:mengzhang
 * @Date:2024/07/20/下午11:22
 */
public class Demo1 {
    public static void main(String[] args){
        //数据类型转换

        int num = 10;

        // 将整数类型转换为小数类型（小的数据类型 转换为 大的数据类型 自动类型转换）

        double num1 = num;

        System.out.println(num1);

        //将大的数据类型转换为小的数据类型 强制转换类型（会损失精度）

        double num2 = 3.14;

        int num3 = (int)num2;
        System.out.println(num3);

        long num4 = 1000L;
        float num5 = num4;
        double num6 = num4;
        System.out.println(num5);
        System.out.println(num6);
    }
}
