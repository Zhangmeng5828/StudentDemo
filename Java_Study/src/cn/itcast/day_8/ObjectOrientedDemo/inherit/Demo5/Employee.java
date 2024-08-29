package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo5;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Employee {
    // 1.类名见名知意，表示员工类

    // 2.所有的成员变量都应该是私有的，不允许外部访问

    // 3.构造方法（空参，带全部参数）

    // 4.getter和setter方法（访问控制权限）


    private String name;
    private int age;
    private double salary;


    public Employee () {
    }

    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
     * @return salary
     */
    public double getSalary () {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary (double salary) {
        this.salary = salary;
    }

    public String toString () {
        return "Employee{name = " + name + ", age = " + age + ", salary = " + salary + "}";
    }

    // 工作
   public void work(){
       System.out.println ("员工正在工作");
   }

    // 吃饭
   public void eat(){
        System.out.println ("吃米饭");
   }
}
