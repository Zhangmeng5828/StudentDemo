package cn.itcast.TestClass;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/下午10:53
 */
public class Test2_求质数 {
    public static void main(String[] args) {
        // 判断 101 ~ 200 之间有多少个素数，并除数所有素数
        int count = 0;
        for (int i = 101; i < 201; i++) {
            // i 依次表示循环中的每一个数

            // 继续判断 i 是否为一个质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字"+i+"是一个质数");
                count++;
            }
        }
        System.out.println("一共有"+count+"个质数");
    }
}
