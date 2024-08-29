package cn.itcast.ObjectOrientedTestClass.PhoneTest;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午3:14
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 1.创建一个数组
        Phone[] arr = new Phone[3];

        // 2.创建三个对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 6999, "黑色");
        Phone p3 = new Phone("苹果", 8999, "红色");

        // 3.将三个对象放入数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;


        // 4.获取三部手机的平均价格
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        double avg = sum / arr.length;
        System.out.println("平均价格为：" + avg);
    }
}
