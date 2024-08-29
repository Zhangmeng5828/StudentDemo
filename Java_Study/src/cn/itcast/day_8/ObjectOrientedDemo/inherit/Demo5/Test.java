package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo5;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象

        Manager manager = new Manager ("Tom",30, 15000,8000);
        System.out.println(manager.getName() + "的工资：" + manager.getSalary()+ "，奖金："+manager.getBonus ());



        Cook cook = new Cook("Jane",25, 10000);
        System.out.println(cook.getName() + "的工资：" + cook.getSalary());
    } 
}
