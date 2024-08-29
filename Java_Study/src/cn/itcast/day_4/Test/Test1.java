package cn.itcast.day_4.Test;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:01
 */
public class Test1 {
    public static void main(String[] args) {

        getLength(4.2,2.4);

    }

    public static void getLength(double width, double len) {
        double result = (width + len) *2;
        System.out.println(result);
    }
}
