package cn.itcast.day_5.GirlFriend;

/**
 * @Author:mengzhang
 * @Date:2024/07/24/下午10:33
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend girlFriend = new GirlFriend();

        // 赋值
        girlFriend.setName("刘亦菲");
        girlFriend.setAge(18);
        girlFriend.setGender("小仙女");



        System.out.println(girlFriend.getName());
        System.out.println(girlFriend.getAge());
        System.out.println(girlFriend.getGender());

        girlFriend.eat();
        girlFriend.sleep();
        girlFriend.playGame();

        System.out.println("======================================");

        GirlFriend girlFriend1 = new GirlFriend();

        girlFriend1.setName("刘诗诗");
        girlFriend1.setAge(24);
        girlFriend1.setGender("御姐");


        System.out.println(girlFriend1.getName());
        System.out.println(girlFriend1.getAge());
        System.out.println(girlFriend1.getGender());

        girlFriend1.playGame();
        girlFriend1.sleep();
        girlFriend1.eat();

    }
}
