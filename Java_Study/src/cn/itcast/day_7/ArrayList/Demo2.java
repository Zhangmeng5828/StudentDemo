package cn.itcast.day_7.ArrayList;

import java.util.ArrayList;

/**
 * @Author:mengzhang
 * @Date:2024/08/13/下午9:44
 */
public class Demo2 {
    public static void main(String[] args){
        /**
         * boolean add(E e)  添加
         * boolean remove(E e)  删除
         * boolean contains(E e)  判断
         * E get(int index)  获取指定索引的元素
         * E set(int index,E e)  修改指定索引的元素
         * int size()  获取长度
         */


        // 1.创建ArrayList对象
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");

        // 3.删除元素
        System.out.println(list.remove("李四"));//true
        System.out.println(list.remove("赵六"));//false
        System.out.println(list.remove(1));//王五

        // 4.修改元素
        System.out.println(list.set(0, "赵六"));//张三
        System.out.println(list);
        System.out.println(list.set(0, "王五"));//赵六
        System.out.println(list.set(0, "李四"));//王五

        // 5.查询元素


        list.add("王五");
        list.add("赵六");
        list.add("鸡哥");
        System.out.println(list.get(0));//李四

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
