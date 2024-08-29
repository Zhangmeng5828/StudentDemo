package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo3;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象并调用方法

        Husky husky = new Husky();
        husky.eat ();
        husky.drink ();
        husky.lookHome ();
        husky.breakHome ();

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();
    }
}
