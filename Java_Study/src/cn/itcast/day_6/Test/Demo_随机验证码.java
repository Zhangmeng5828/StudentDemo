package cn.itcast.day_6.Test;

import java.util.Random;

import static cn.itcast.day_6.Test.Demo_随机打乱字符内容.randomString;

/**
 * @Author:mengzhang
 * @Date:2024/08/11/下午5:19
 */
public class Demo_随机验证码 {
    public static void main(String[] args) {
        // 1.定义一个数组，存储大写字母，小写字母
        char[] arr = {'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T','U','V'
                ,'W','X','Y','Z','a','b','c','d','e','f','g','h'
                ,'i','j','k','l','m', 'n','o','p','q','r','s','t'
                ,'u','v','w','x','y','z'};

        // 2.调用方法，获取验证码的字母部分
        /*String s1 = "";
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 52);
           char c = arr[index];
            String s = c + "";
            s1 += s;
        }*/
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 52);
            stringBuilder.append(arr[index]);
        }

        // 3.定义一个字符串，存储验证码的数字部分
        /*String s2 = s1 +(int) (Math.random() * 10);*/
        stringBuilder.append((int) (Math.random() * 10));

        /*char[] arr2 = stringBuilder.toString().toCharArray();


        //char[] arr2 = s2.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            int index = (int) (Math.random() * arr2.length);
            char temp = arr2[i];
            arr2[i] = arr2[index];
            arr2[index] = temp;
        }*/


        // 调用import static cn.itcast.day_6.Test.Demo_随机打乱字符内容.randomString 中的方法，打乱验证码的字符内容
        String s2 = randomString(stringBuilder.toString());


        System.out.println(s2);
        /*System.out.println(new  String(arr2));*/
     }
}
