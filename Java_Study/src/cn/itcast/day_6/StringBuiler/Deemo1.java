package cn.itcast.day_6.StringBuiler;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/下午6:48
 */
public class Deemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();


        // 容量： 最多能装多少   默认16
        // 长度：当前装了多少个字符

        sb.append("abcdefghijklmnopqrstuvwxyz");//
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
