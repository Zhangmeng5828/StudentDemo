package cn.itcast.day_6.StringDemo.Test;

/**
 * @Author:mengzhang
 * @Date:2024/08/06/下午8:40
 */
public class StringDemoTest3_字符串拼接 {
    public static void main(String[] args) {
        /**
         * 定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回
         * [11,22,33,44,55]  -->  11,22,33,44,55
         */
        int[] arr = {11,22,33,44,55};
        String str = arrToString(arr);
        System.out.println(str);


    }

    // 1.我要干嘛？ -->  把int数组中的数据按照指定格式拼接成一个字符串返回
    // 2.我干这件事情需要什么？    -->  int[] arr
    // 3.我干这件事情，是否需要把结果返回？  -->  需要返回

    public static String arrToString(int[] arr){
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {


            if (i == arr.length-1){
                str += arr[i];
            }else {
                str += arr[i] + ", ";
            }
        }
        str += "]";
        return str;
    }

}
