package cn.itcast.day_5.phone;

/**
 * @Author:mengzhang
 * @Date:2024/07/24/上午9:24
 */
public class Test_面向对象 {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();


        // 叫做给手机赋值
        p.brand = "小米";
        p.price = 2998.0;

        // 获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用手机中的方法
        p.call();
        p.playGame();


    }
}
