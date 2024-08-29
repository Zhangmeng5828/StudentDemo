package cn.itcast.TestClass;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/下午11:52
 */
public class Test4_copy_arr {
    public static void main(String[] args) {
        /*需求：
            把一个数组中的元素复制到另一个数组中
        * */
        //分析：
        // 1.定义一共老数组并存储元素
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2.定义一共新数组和老数组一样长
        int[] newArr = new int[arr.length];
        // 3.遍历老数组，得到老数组中的每一个元素，依次存放到新数组中
        for (int i = 0; i < arr.length; i++) {
            // i表示老数组中的索引
            // arr[i]表示老数组中的元素
            newArr[i] = arr[i];
        }
        // 打印新数组，验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
