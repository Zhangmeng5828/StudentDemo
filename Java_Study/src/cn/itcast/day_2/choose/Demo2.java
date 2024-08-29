package cn.itcast.day_2.choose;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午9:00
 */
public class Demo2 {
    public static void main(String[] args) {
        // 运算符

        // = 赋值运算符
        int a = 10;
        int b = 20;

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+":"+b);


        // + - * / % 算术运算符
        int c = 100;
        int d = 20;
        int e1 = c +d;
        int e2 = c -d;
        int e3 = c * d;
        double e4 = (c+0.0) / d;
        double e5 = (c+0.0) % d;

        System.out.println(e1+":"+e2+":"+e3+":"+e4+":"+e5);



        // > < == >= <= !=  关系运算符
        // 只要是关系运算符 最后的结果是boolean类型

        int f1 = 10;
        int f2 = 20;
        boolean result = f1 > f2;
        boolean result1 = f1 < f2;
        boolean result2 = f1 == f2;
        boolean result3 = f1 != f2;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // && || !      逻辑运算符   ( & 单与  | 单或    如果表达式前面的值已经确定表达式后面的值也会判断)
        // && : 如果与符号两边的表达式 同时为true 结果就是true    否则结果false
        // || : 如果或符号两边的表达式有任意一边为true 结果就是true  否则结果false
        // 在C语言中(&  |)指位运算

        int g = 10;
        int h = 20;
        //短路与   增加程序执行的效率  如果第一个结果已经是false   后面的表达式将不会在判断了
        boolean r = g > h && h > ++g;
        System.out.println(r);
        System.out.println(g);

        //短路或   如果第一个表达式结果已经为true   后面的表达式将不会在判断

        boolean r1 = g < h || h < ++g;
        System.out.println(r1);
        System.out.println(g);

    }
}
