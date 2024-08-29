package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo4;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Student extends Person {
    public Student(){
        //调用父类的构造方法,隐藏的super()去调用父类构造方法
        super();
        System.out.println("Student 无参构造方法");
    }

    public Student(String name, int age){
        super(name, age);
        System.out.println("Student 有参构造方法");
    }

}
