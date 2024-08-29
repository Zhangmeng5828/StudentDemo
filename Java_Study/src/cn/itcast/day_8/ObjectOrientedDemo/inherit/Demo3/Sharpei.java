package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo3;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Sharpei extends Dog {
    // 因为沙皮狗吃狗粮和骨头
    // 所以Sharpei类也要重写父类的eat方法
    @Override
    public void eat() {
        super.eat();
        System.out.println("沙皮狗吃骨头");
    }
}
