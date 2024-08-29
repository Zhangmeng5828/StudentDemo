package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo2;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class ArrayUtil {
    // 私有化构造方法
    // 目的：为了不让外界创建他的对象
   private ArrayUtil () {
    }

    public static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            // i 索引 arr[i] 元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }



    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

}
