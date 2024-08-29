package cn.itcast.ObjectOrientedTestClass.GirlFriend;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午3:35
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        // 1.定义数组存储女朋友对象
        GirlFriend[] arr = new GirlFriend[4];

        // 2.创建女朋友对象，并赋值给数组元素
        arr[0] = new GirlFriend("刘亦菲",18,"小仙女", "吃零食");
        arr[1] = new GirlFriend("杨幂",20,"萌妹子", "逛街");
        arr[2] = new GirlFriend("赵丽颖",19,"女神", "跳舞");
        arr[3] = new GirlFriend("迪丽热巴",21,"小甜甜", "唱歌");

        // 3.遍历数组，求女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);

        // 4.遍历数组，求年龄低于平均值的女朋友的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg){
                count++;
            }
        }
        System.out.println("年龄低于平均值的女生有：" + count + "个");
        System.out.println("信息如下：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg){
                System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getGender() + " " + arr[i].getHobby());
            }
        }

    }
}
