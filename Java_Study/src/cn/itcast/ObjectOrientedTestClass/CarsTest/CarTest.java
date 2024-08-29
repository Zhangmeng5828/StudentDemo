package cn.itcast.ObjectOrientedTestClass.CarsTest;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/上午10:12
 */
public class CarTest {
    public static void main(String[] args) {
        // 1.创建一个数组用来存储3个汽车对象
        Car[] cars = new Car[3];

        // 2.创建汽车对象并赋值给数组
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            System.out.println("请输入第" + (i + 1) + "辆汽车的品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "辆汽车的价格：");
            double price = sc.nextDouble();
            car.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆汽车的颜色：");
            String color = sc.next();
            car.setColor(color);
            cars[i] = car  ;
        }

        // 3.遍历数组，输出汽车信息
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("第" + (i + 1) + "辆汽车的信息：\n"+ "品牌："+ car.getBrand()+ "\n价格：" + car.getPrice() + "\n颜色：" + car.getColor());
        }
    }
}
