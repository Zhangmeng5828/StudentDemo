package cn.itcast.day_7.ArrayList.Test.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午8:23
 */
public class Student_ArrayList1 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2.键盘录入学生信息，并添加到集合中
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入学生姓名：");
            String name = scanner.next();
            System.out.println("请输入学生年龄：");
            int age = scanner.nextInt();
            // 3.创建学生对象
            Student student = new Student(name,age);
            // 4.将学生对象添加到集合中
            list.add(student);
            System.out.println("是否继续添加？(y/n)");
            String flag = scanner.next();
            if (flag.equals("n"))
                break;
        }
        // 5.遍历集合，输出学生信息
        for (Student student : list) {
            System.out.println(student.getName() + " " + student.getAge());
        }

    }
}
