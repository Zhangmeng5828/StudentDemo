package cn.itcast.day_1;

/**
 * @Author:mengzhang
 * @Date:2024/07/20/下午11:21
 */

/**
 * java的注释有三种:
 * 单行注释 ： //    介绍变量    单行代码的作用
 *
 */
//多行注释 : /* */ 介绍代码作用 如果一行写不下用来多行注释
//文档注释 : /** */ 介绍方法和类的作用




// public ：公共的      class :类        这是一个公共类（任何类都可以访问此类）
public class Demo1 {
    //程序想要运行 必须要有main方法
    /*
        static :静态的
        void : 空    无返回值
        main : 方法名 程序入口
        String : 字符串
        args : 参数
     */
    public static void main(String[] args) {
        //输出语句 将字符串输出到控制台
        /*
            System : 系统
            out : 向外    出去
            print : 打印
            line : 行
         */
        System.out.println("Hello World!!");


        /*
            转移符: \t :空出一个制表位
            \n : 换行
        * */
        System.out.println("你好\t欢迎来到\n中国");
    }
}
