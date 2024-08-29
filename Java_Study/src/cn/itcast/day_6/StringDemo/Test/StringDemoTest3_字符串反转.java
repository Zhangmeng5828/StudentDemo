package cn.itcast.day_6.StringDemo.Test;

/**
 * @Author:mengzhang
 * @Date:2024/08/06/下午8:53
 */
public class StringDemoTest3_字符串反转 {
    public static void main(String[] args) {
        /**
         * 字符串反转
         * 键盘输入一个字符串，将字符串反转输出
         * 例如：键盘输入abc，输出cba
         * 思路：
         * 1.键盘输入一个字符串
         * 2.将字符串转换为字符数组
         * 3.使用双指针，一个指向数组开头，一个指向数组结尾
         * 4.交换两个指针指向的字符
         * 5.两个指针向中间移动，重复步骤4，直到两个指针相遇
         * 6.将字符数组转换为字符串输出
         * 7.输出结果
         * 8.结束
         */
        String str = "abc";
        System.out.println(reverse(str));
    }
    // 1.我要干嘛？--》实现字符串反转
    // 2.我怎么做？--》键盘输入一个字符串，将字符串转换为字符数组，使用双指针，一个指向数组开头，一个指向数组结尾，交换两个指针指向的字符，两个指针向中间移动，重复步骤4，直到两个指针相遇，将字符数组转换为字符串输出
    // 3.是否需要继续使用方法的结果？--》是

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
