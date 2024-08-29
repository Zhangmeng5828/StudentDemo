package cn.itcast.day_4.Test2;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:46
 */
public class Test2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int max = getMax(arr);
        System.out.println(max);

    }


    // 求数组的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
