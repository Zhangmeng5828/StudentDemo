package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo1;

import java.util.Scanner;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi zi = new Zi();

        // 利用带参构造创建子类对象
        //子类无法调用父类构造器，只能调用自己的构造器
        //Zi zi2 = new Zi("小米", 18);


        // 调用父类成员变量
        zi.setName ("小米");
        zi.setAge  (18);
        System.out.println(zi.getName() + " " + zi.getAge ());

        // 调用父类方法
        /*
        虚方法表：
        1.不能是private
        2.不能是static
        3.不能是final
        子类可以重写父类的方法，但不能改变方法的访问权限、final、static属性
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
    }
}
