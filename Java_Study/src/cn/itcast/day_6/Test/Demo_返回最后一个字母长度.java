package cn.itcast.day_6.Test;

/**
 * @Author:mengzhang
 * @Date:2024/08/11/下午11:40
 */
public class Demo_返回最后一个字母长度 {
    public static void main(String[] args) {
        String str = "hello      world";
        /**
         * 思路：
         * 倒着遍历字符串，遇到空格就结束
         * 将遍历的次数作为长度返回
         */
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        System.out.println("最后一个单词长度"+count);
    }
}
