package cn.itcast.day_3;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午9:37
 */
public class ArrTest {
    public static void main(String[] args) {

        // 定义一个数组，1 2 3 4 5 6 7 8 9 10
        // 遍历数组统计有多少可以被3整除

        int count = 0;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int j : arr) {
            if (j % 3 == 0) {
                count++;
            }
        }

        System.out.println("数组中能被3整除的数字有"+count+"个");


        // 如果是奇数 扩大两倍
        // 如果是偶数 变为原来的二分之一

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }else {
                arr[i] = arr[i] *2;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
