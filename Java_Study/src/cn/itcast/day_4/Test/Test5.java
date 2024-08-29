package cn.itcast.day_4.Test;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:33
 */
public class Test5 {
    public static void main(String[] args) {

        compare(1,4);
        compare(2.3,4.5);
        compare((byte)2.3,(byte)4.5);


    }
    public static void compare(short b1, short b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(double d1, double d2) {
        System.out.println(d1 == d2);
    }
    public static void compare(long l1, long l2) {
        System.out.println(l1 == l2);
    }
    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }
    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

}
