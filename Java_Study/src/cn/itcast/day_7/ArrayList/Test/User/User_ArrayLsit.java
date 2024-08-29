package cn.itcast.day_7.ArrayList.Test.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午8:43
 */
public class User_ArrayLsit {
    public static void main(String[] args) {
        // 1.创建一个User集合
        ArrayList<User> list = new ArrayList<>();

        // 2.键盘录入User信息
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入用户ID：");
            String id = scanner.next();
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();

            User user = new User(id,username,password);

            list.add(user);

            System.out.println("是否继续输入：(y/n)");
            String flag = scanner.next();
            if (flag.equals("n")){
                break;
            }
        }
        // 3.调用方法查看ID是否重复

        System.out.println("请输入你要查询的ID：");
        String id = scanner.next();
        System.out.println(contains(list,id));
        System.out.println(getIndex(list,id));
    }

    // 1.我要干嘛？ 根据ID查找用户
    // 2.我干这件事情需要什么？ ID，集合
    // 3.我干完之后，有没有什么结果？ 有，返回一个boolean
    public static boolean contains(ArrayList<User> list,String id){
        for (User user : list) {
            if (user.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    // 1.我要干嘛？ 根据ID查找用户
    // 2.我干这件事情需要什么？ ID，集合
    // 3.我干完之后，有没有什么结果？ 有，返回一个索引
    public static int getIndex(ArrayList<User> list,String id){
        for(User user : list){
            if (user.getId().equals(id))
                return list.indexOf(user);
        }
        return -1;
    }

}
