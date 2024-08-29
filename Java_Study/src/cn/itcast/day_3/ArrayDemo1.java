package cn.itcast.day_3;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午11:12
 */
public class ArrayDemo1 {
    public static void main(String[] args) {


        // 完整格式：
        // 数据类型 [] 数组名 = new    数据类型 []{元素1,元素2,元素3};
        // int[] arr = new int[]{1,2,3,4,5,22,....};
        // 简化格式:
        // 数据类型 [] 数组名 = {元素1,元素2,元素3};
        // int[] arr = {1,2,3,4,5};

        // 需求1: 定义数组存储5个学生的年龄
        int[] arr = new int[]{18,23,55,22,63};
        int[] arr2 = {18,23,55,22,63};

        // 需求2: 定义数字存储3个学生姓名
        String[] arr3 = new String[]{"张三","李四","王五"};
        String[] arr4 = {"张三","李四","王五"};

        // 需求3: 定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.82,2.3,1.55,2.2};
        double[] arr6 = {1.82,2.3,1.55,2.2};
    }
}
