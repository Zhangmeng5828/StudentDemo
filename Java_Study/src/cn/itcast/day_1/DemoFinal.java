package cn.itcast.day_1;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午12:25
 */
public class DemoFinal {
    public static void main(String[] args) {
        //常量 ： 不可变的量    被final所修饰
        int a = 100;

        //程序中有些值不能被修改 PI    身份证号
        //命名规则：大写   多个单词下划线拼接

        final  double PI = 3.1415926;

        // 从控制台接收圆的半径
        Scanner scanner = new Scanner(System.in);


        //计算圆的面积
        double area ;
        //打印出友好界面
        System.out.print("请输入圆的半径: ");
        int r = scanner.nextInt();//从控制台接受int类型的值   其他数据类型nextXXXX
        area = PI*r*r;
        System.out.println("圆的面积:"+area);

        //其他接收方式
        String name =scanner.next();//从控制台接收字符串
        double F = scanner.nextDouble();
        char ch = scanner.next().charAt(0);
        long L = scanner.nextLong();
        short s = scanner.nextShort();
        boolean b = scanner.nextBoolean();









    }
}
