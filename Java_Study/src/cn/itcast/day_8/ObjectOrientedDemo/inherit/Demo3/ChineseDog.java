package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo3;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class ChineseDog extends Dog{

    // 中华田园犬只吃剩饭
    @Override
    public void eat() {
        System.out.println("中华田园犬吃剩饭");
    }
}
