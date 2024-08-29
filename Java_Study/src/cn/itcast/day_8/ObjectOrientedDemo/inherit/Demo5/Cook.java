package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo5;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Cook extends Employee {

    public Cook() {

    }
    public Cook (String name, int age, double salary) {
        super (name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
