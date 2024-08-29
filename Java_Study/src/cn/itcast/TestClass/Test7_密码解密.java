package cn.itcast.TestClass;

/**
 * @Author:mengzhang
 * @Date:2024/07/23/下午5:38
 */
public class Test7_密码解密 {
    public static void main(String[] args) {
        /*需求：
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则：
        先得到每位数，然后每位数都加5，再对10求余，最后将所有数字反转，得到一串新数


        按照以上规则进行解密
        * */

        // 定义一共数组存储解密之后的结果
        int[] arr = {8,3,4,6};
        // 反转回原来顺序
        int temp ;
        for (int i = 0, j = arr.length -1;i < j; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        /*由于加密时是对10取余
        所以解密时解密判断：
        0 ~ 4 就 +10
        5 ~ 9 就 不变
        * */

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        // 每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = arr[i] + 10 * number;
        }
        System.out.println("解密:"+number);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/


    }
}
