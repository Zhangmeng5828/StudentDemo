package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo;

/**
 * @author menegzhang
 * @data 2024/8/23
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        // 1.创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        // 2.调用间接父类方法
        rd.eat();
        rd.drink();
        // 3.调用直接父类方法
        rd.catchMouse();

        //  1.创建哈士奇对象

        Husky hk = new Husky();
        // 2.调用间接父类方法
        hk.eat();
        hk.drink();
        // 3.调用直接父类方法
        hk.lookHome ();
        // 4.调用子类方法
        hk.breakHome ();
    }
}
