package cn.itcast.day_3;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午11:27
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 利用索引访问数组中的元素
        //格式 ： 数组名[索引]

        int sum = 0;
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // 把数据存储到数组中
        // 格式 ： 数组名[索引] = 具体数据/变量;
        // 细节： 一旦覆盖，原来数据就不存在了

        arr[0] = 55;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }





    }
}
