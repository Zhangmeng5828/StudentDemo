package cn.itcast.day_7.ArrayList.Test.Student;

import java.util.ArrayList;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午8:05
 */
public class Student_ArrayList {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        // 2.创建一个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        // 3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 4.遍历
        for (int i = 0; i < list.size(); i++) {
            // i 索引 list.get(i) 元素
            Student s = list.get(i);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

}
