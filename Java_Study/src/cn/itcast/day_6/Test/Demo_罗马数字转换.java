package cn.itcast.day_6.Test;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午10:25
 */
public class Demo_罗马数字转换 {
    public static void main(String[] args) {
        /**
         * 将阿拉伯数字转换成罗马数字
         * 注意：罗马数字没有0
         * 如果出现0用""表示
         * Ⅰ-1,Ⅱ-2,Ⅲ-3,Ⅳ-4,Ⅴ-5,Ⅵ-6,Ⅶ-7,Ⅷ-8,Ⅸ-9
         *
         */

        // 1.键盘录入一个整数
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");

            str = scanner.next();

            //        2.判断输入的整数是否合法
            boolean flag = checkStr(str);
            if (flag) {
                break;
            }else {
                System.out.println("当前输入的字符串不合法，请重新输入");
            }
        }
        StringJoiner sj = new StringJoiner(", ","[", "]");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c -48;
            sj.add(getRomanNum(num));
        }
        System.out.println(sj.toString());


        StringJoiner sj1 = new StringJoiner(", ","[", "]");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sj1.add(getRomanNum(c));
        }
        System.out.println(sj1.toString());
    }
    public static String getRomanNum(int num){
        String[] arr ={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ",};
        return arr[num];
    }

    public static String getRomanNum(char num){

        String string = switch (num){
            /*case '1':
                string = "Ⅰ";
                break;
            case '2':
                string = "Ⅱ";
                break;
            case '3':
                string = "Ⅲ";
                break;
            case '4':
                string = "Ⅳ";
                break;
            case '5':
                string = "Ⅴ";
                break;
            case '6':
                string = "Ⅵ";
                break;
            case '7':
                string = "Ⅶ";
                break;
            case '8':
                string = "Ⅷ";
                break;
            case '9':
                string = "Ⅸ";
                break;
            default:
                string = "";*/

            case '1' ->  "Ⅰ";
            case '2' ->  "Ⅱ";
            case '3' ->  "Ⅲ";
            case '4' ->  "Ⅳ";
            case '5' ->  "Ⅴ";
            case '6' ->  "Ⅵ";
            case '7' ->  "Ⅶ";
            case '8' ->  "Ⅷ";
            case '9' ->  "Ⅸ";
            default -> string = "";
        };
        return string;
    }

    public static boolean checkStr(String str){
        // 1.长度小于等于9
        if (str.length() > 9){
            return false;
        }
        // 2.判断是否是数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        // 3.判断是否是负数
        if (str.charAt(0) == '-') {
            return false;
        }
        return true;
    }
}
