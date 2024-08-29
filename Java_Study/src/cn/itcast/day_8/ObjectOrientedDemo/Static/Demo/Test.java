package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo;

import java.util.ArrayList;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建三个学生对象
        Student stu1 = new Student("zhangsan", 18,"男");
        Student stu2 = new Student("lisi", 18,"男");
        Student stu3 = new Student("wangwu", 18,"男");


        // 3.把学生对象添加到数组集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println ( StudentUtil.getMaxStudent (list));
    }
}
