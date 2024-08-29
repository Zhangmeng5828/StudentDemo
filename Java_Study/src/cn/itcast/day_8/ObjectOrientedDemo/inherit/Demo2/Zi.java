package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo2;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡" ;

    /*public void show() {
        // 如何打印Zi
        System.out.println ("我是" + name);
        System.out.println ("我是"+this.name);
        // 如何打印Fu
        System.out.println ("我是" +super.name);

        // 如何打印喝茶
        System.out.println (hobby);
        System.out.println (this.hobby);
        System.out.println (super.hobby);


        // 如何打印吃鸡
        System.out.println (game);
        System.out.println (this.game);
    }*/

    //重写父类方法应用场景：子类有自己的方法实现，
    // 但是又要调用父类的方法，这时就需要重写父类的方法。
    /**
     * 重写方法的名次、参数、返回值必须和父类的方法完全一致。
     * 重写方法的作用：子类可以根据自己的需要，对父类的方法进行修改。
     * 重写方法的好处：可以增加子类独有的功能，
     * 同时也保留了父类的方法，不会造成混乱。
     * 重写的返回值类型可以是父类方法的返回值类型，也可以是子类自己的类型。
     */

    @Override
    public void eat() {
        // 如何打印吃饭
        super.eat();
    }
    @Override
    public void Drink() {
        // 如何打印喝茶
        System.out.println (hobby);
    }
}
