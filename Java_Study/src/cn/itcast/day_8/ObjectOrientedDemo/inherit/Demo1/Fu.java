package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo1;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Fu {
    private String name;
    private int age;


    public Fu () {
    }

    public Fu (String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString () {
        return "Fu{name = " + name + ", age = " + age + "}";
    }
}
