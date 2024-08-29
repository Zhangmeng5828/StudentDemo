package cn.itcast.day_7.ArrayList.Test.iphone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午9:14
 */
public class Phone_ArrayList {
    public static void main(String[] args) {

        // 1.创建一个ArrayList集合，存储手机对象
        ArrayList<Phone> list = new ArrayList<>();

        // 2.添加手机信息
        Phone phone = new Phone("Redmi K70 至尊版",3699);
        Phone phone1 = new Phone("iphone 15 ProMax",12999);
        Phone phone2 = new Phone("华为 Pura 70 Pro+",7899);

        list.add(phone);
        list.add(phone1);
        list.add(phone2);


        // 3.调用方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想要查看手机价格：");
        int price = scanner.nextInt();

        /*ArrayList<Phone> phoneInfoList = getPhoneByPrice(price,list);

        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phoneInfo = phoneInfoList.get(i);
            System.out.println(phoneInfo.getBrand() + "------"+phoneInfo.getPrice());
        }*/

        for (int i = 0; i < getPhoneByPrice(price, list).size(); i++) {
            Phone phoneInfo = getPhoneByPrice(price, list).get(i);
            System.out.println("品牌:"+phoneInfo.getBrand() + " ------"+" 价格:"+phoneInfo.getPrice()+"元");
        }


    }
    // 1.我要干嘛？ 根据价格查看手机信息
    // 2.我干这件事情需要什么？ price,list
    // 3.我干完之后，有没有什么结果？ 有，返回一个 phone
    public static ArrayList<Phone> getPhoneByPrice(int price,ArrayList<Phone> list){
        ArrayList<Phone> resultList = new ArrayList<>();
        for(Phone p : list){
            if (p.getPrice() < price){
                resultList.add(p);
            }
        }
        return resultList;
    }
}
