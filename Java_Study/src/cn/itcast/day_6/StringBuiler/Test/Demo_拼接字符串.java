package cn.itcast.day_6.StringBuiler.Test;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午4:16
 */
public class Demo_拼接字符串 {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9};

        // 2.调用方法把数组拼接成字符串
        String s = arrayToString(arr);
        // 3.输出结果
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
