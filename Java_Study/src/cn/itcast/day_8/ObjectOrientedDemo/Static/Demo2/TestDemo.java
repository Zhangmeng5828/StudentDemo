package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo2;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class TestDemo {
    public static void main(String[] args) {
        // 测试工具类中的两个方法是否正确

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String string = ArrayUtil.printArray(arr);
        System.out.println(string);

        double[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println (ArrayUtil.getAverage (arr1));


    }
}
