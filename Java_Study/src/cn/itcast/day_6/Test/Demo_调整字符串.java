package cn.itcast.day_6.Test;

/**
 * @Author:mengzhang
 * @Date:2024/08/11/下午3:58
 */
public class Demo_调整字符串 {
    public static void main(String[] args){
        /**
         * 给定两个字符串，A和B
         * A的旋转操作就是将A，最左边的字符移动到最右边
         * 例如，字符串A="abcde"在移动一次之后变成"bcdea"，
         * 如果在若干次调整之后，A和B相等，那么返回True
         * 否则返回false
         */
        // 1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        // 2.调用方法
        boolean result = isRotateString(strA, strB);

        // 3.输出结果
        System.out.println(result);


    }

    public static boolean isRotateString(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = rotateString(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    public static String rotateString(String A) {
        /**
         *  方法1：
         *  用substring方法截取字符串，把左边的字符截取，把右边拼接
          */
        /*//获取最左边的字符
        char first = A.charAt(0);
        // 获取剩余的字符
        String rest = A.substring(1);
        // 将字符拼接
        return   rest + first;*/


        /**
         * 方法2：
         * 可以把字符串变成一个数组，然后循环遍历，把第一个字符放到最后面
         */
        // 把字符串变成一个数组
        char[] arr = A.toCharArray();
        // 循环遍历
        char temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        // 把第一个字符放到最后面
        arr[arr.length - 1] = temp;

        return new String(arr);

    }
}
