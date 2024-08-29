package cn.itcast.day_7.ArrayList;

import java.util.ArrayList;

/**
 * @Author:mengzhang
 * @Date:2024/08/13/下午9:35
 */
public class Demo1 {
    public static void main(String[] args){
        // 1.创建ArrayList对象
        // JDK7以前的写法
        ArrayList<String> list = new ArrayList<String>();
        // JDK7以后的写法
        ArrayList<String> list2 = new ArrayList<>();

        // 此时我们创建的是ArrayList对象，而ArrayList是java已经写好的类
        // 这个类在底层做了一些处理，
        // 打印对象不是地址值，而是内容
        // 在展示的时候会拿[]把所有元素包裹起来
        System.out.println(list+"\n"+list2);
    }
}
