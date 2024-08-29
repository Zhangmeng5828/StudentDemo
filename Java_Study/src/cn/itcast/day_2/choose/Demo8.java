package cn.itcast.day_2.choose;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/上午10:05
 */
public class Demo8 {
    public static void main(String[] args) {

        //  百米赛跑 进入15秒内的进入决赛    根据性别分别进入男子组或女子组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的百米赛跑时间:");
        int second = sc.nextInt();

        if (second <= 15) {
            // 晋级   分组
            System.out.println("请输入你的性别:");
            String sex = sc.next();
            //equals() : 比较字符串（此方法来自String类型只有字符串才能调用）
            if (sex.equals("男")){
                System.out.println("男子组");
            }else {
                System.out.println("女子组");
            }
        }else {
            System.out.println("淘汰！！！");
        }
    }
}
