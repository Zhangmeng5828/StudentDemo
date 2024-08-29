package cn.itcast.day_7.ArrayList.Test;

import java.util.ArrayList;

/**
 * @Author:mengzhang
 * @Date:2024/08/13/下午10:22
 */
public class Test_遍历集合 {
    public static void main(String[] args){
        // 1.创建集合
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        // 2.添加元素
        /*list.add("Hello");
        list.add("World");
        list.add("I");
        list.add("Love");
        list.add("Java");*/
        // JDK 5 以后int 和 Integer 可以互相转化
        /*list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);*/

        list2.add('1');
        list2.add('2');




        // 3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list2.size(); i++) {
            if (i == list2.size()-1){
                System.out.print(list2.get(i)+"]");
            }else {
                System.out.print(list2.get(i)+", ");
            }
        }
    }
}
