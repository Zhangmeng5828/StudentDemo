package cn.itcast.day_7.ArrayList.Test.Student;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午8:07
 */
public class Student {
    // 1.私有化成员变量
        private String name;
        private int age;

    // 2.空参构造方法
    public Student() {
    }
    // 3.有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 4.提供get/set方法
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }




}
