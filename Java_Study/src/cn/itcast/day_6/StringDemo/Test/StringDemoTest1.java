package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/06/下午8:02
 */
public class StringDemoTest1 {
    public static void main(String[] args) {
        // 读题拆解法
        /**
         * 已知正确的用户名和密码，请用程序实现模拟用户登录。
         * 总共三次机会，登录之后，给出现应提示
         */

        // 1.定义两个变量，用于存储正确的用户名和密码

        String rightUserName = "admin";
        String rightPassWord = "123456";

        Scanner sc = new Scanner(System.in);

        // 2.键盘输入用户名和密码
        for (int i = 0; i < 3; i++) {



            System.out.println("请输入用户名");
            String userName = sc.nextLine();
            System.out.println("请输入密码");
            String passWord = sc.nextLine();

            // 3.判断用户名和密码是否正确
            if(userName.equals(rightUserName) && passWord.equals(rightPassWord)) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.print("登录失败,用户名或密码错误");
            }
            if (i == 2) {
                System.out.println("账号"+rightUserName+"已锁定，请联系管理员: 0270216-5654-16255");
                break;
            }else if (i == 1) {
                System.out.println("还有一次机会");
            }else {
                System.out.println("还有两次机会");
            }
        }
    }
}
