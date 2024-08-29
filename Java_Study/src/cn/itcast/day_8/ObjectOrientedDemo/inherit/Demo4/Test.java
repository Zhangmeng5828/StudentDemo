package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo4;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student();

        Student student1 = new Student("张三", 20);
        System.out.println (student1.name + " " + student1.age);
        // 调用父类方法
    }
}
