package cn.itcast.day_4.Test2;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:50
 */
public class Test3 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        boolean contains = contains(52, arr);
        System.out.println(contains);
    }



    // 判断一个数在数组中是否存在
    public static boolean contains(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
