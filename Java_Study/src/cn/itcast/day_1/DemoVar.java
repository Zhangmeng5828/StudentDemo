package cn.itcast.day_1;

/**
 * @Author:mengzhang
 * @Date:2024/07/20/下午11:43
 */
public class DemoVar {
    public static void main(String[] args){
        //声明字符串变量
        //String : 字符串
        String name = "王腾大佬";

        System.out.println(name);
        System.out.println("学习鬼才"+name);


        //  变量 : 在内存中申请一块空间存储值

        //  变量的组成部分 :   变量名 数据类型    值
        //  变量名:    规则: 字(字母)   下(下划线)
        //  美(美元符号) 人(人名币符号)    数(数字)
        //  驼峰(驼峰命名法)

        //只能以字母和美元符号开头

        //  abc a_c $a  a￥ abc123   usrName

        //数据类型 : Java中 八大数据类型   最常用的引用数据类型:String
        /*
            byte  short   int
            long    float   double
            boolean     char
        * */
        /*
            btye : 字符
            short:  短整型
            int :   整型
            long:   长整型
            float:  单精度浮点型
            double: 双精度浮点型
            bollean: 布尔型    值:  true    真   false   假
            char:   字符
        * */

        //  变量的使用：  数据类型 变量名    =   值
        //  1.先声明后赋值
        String userName;//声明
        userName = "钱大亨";//赋值

        //声明的同时赋值
        String name1 = "王多鱼";

        //其他数据类型的声明方式
        //                                      取值范围
        byte b = 1;    // 1字节8位     //-128 ~ +127
        short s = 12;  // 2字节16位     //-32768(-2^15) ~ 32767(+2^15-1)
        int i = 100;   // 4字节32位     //-2147483648(-2^31) ~ +2147483647(2^31-1)
        long l = 1000L;// 8字节64位     //-2^63 ~ +2^63-1

        float f = 3.14F;//4字节32位浮点数 //1.4E-45 ~ 3.4E+38 , -1.4E-45 ~ -3.4E+38
        double d = 3.1415926;//8字节64位 //4.9E-324 ~ 1.7E+308 , -4.9E-324 ~ -1.7E+308
        boolean bool1 = true;
        boolean bool2 = false;
        char c = 'a' ;

        System.out.println(i);
        System.out.println("变量的值是:"+i); //任何数据只要与字符串拼接都会变成字符串

    }
}
