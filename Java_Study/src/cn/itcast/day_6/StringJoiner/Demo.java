package cn.itcast.day_6.StringJoiner;

import java.util.StringJoiner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午4:29
 */
public class Demo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("张三").add("李四").add("王五");
        System.out.println(sj.toString());


        System.out.println(sj.length());
        System.out.println(sj.equals("王小二"));

        System.out.println(sj.setEmptyValue("没有数据"));



        // 合并
        StringJoiner sj2 = new StringJoiner(",","[","]");
        sj2.add("赵六").add("钱七").add("孙八");

        System.out.println(sj.merge(sj2));
    }
}
