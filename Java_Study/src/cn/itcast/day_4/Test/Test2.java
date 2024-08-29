package cn.itcast.day_4.Test;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:04
 */
public class Test2 {
    public static void main(String[] args) {
        getArea(51);
    }

    public static void getArea(double radius) {
        final double PI = 3.14;
        double area = PI * radius * radius;
        System.out.println(area);

    }
}
