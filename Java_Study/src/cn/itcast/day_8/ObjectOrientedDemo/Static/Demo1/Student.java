package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo1;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    public static String tearch;

    public Student () {
    }

    public Student (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student (String name, int age, String gender, String tearch) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tearch = tearch;
    }

    /**
     * 获取
     * @return name
     */
    public String getName () {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge () {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge (int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender () {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender (String gender) {
        this.gender = gender;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(tearch);
    }

    public void study () {
        System.out.println (name+"正在学习");
    }

    /**
     * 获取
     * @return tearch
     */
    public String getTearch () {
        return tearch;
    }

    /**
     * 设置
     * @param tearch
     */
    public void setTearch (String tearch) {
        this.tearch = tearch;
    }

    public String toString () {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", tearch = " + tearch + "}";
    }
}
