package cn.itcast.day_4.Test2;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:40
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        printArr(arr);


    }


    // 设计一共方法用于数组遍历, 要求遍历的结果实在一行上
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
