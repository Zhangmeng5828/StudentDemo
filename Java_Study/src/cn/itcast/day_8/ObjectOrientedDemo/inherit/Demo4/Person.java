package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo4;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Person {
    String name;
    int age;
    public Person(){
        System.out.println ("Person 无参构造方法");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println ("Person 有参构造方法");
    }

}
