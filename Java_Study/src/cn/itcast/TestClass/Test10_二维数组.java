package cn.itcast.TestClass;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/23/下午11:33
 */
public class Test10_二维数组 {
    public static void main(String[] args) {

       /* getStaticTwoDimensionalArray();
        getRunTwoDimensionalArray();*/

        getTwoDimensionalArrayTest();

    }

    // 静态二维数组
    private static void getStaticTwoDimensionalArray() {
        /*
         * 二维数组的静态初始化格式：
         *           数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2}，{元素1,元素2}};
         *  简化格式:
         *           数据类型[][] 数组名 = {{},{}};
         * 元素访问:
         *           数组名[索引][索引];
         * 二维数组遍历:
         *           先得到一维数组, 在遍历一遍一维数组获取元素
         * */

        /*
         * 1.二维数组静态初始格式化
         *  数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2}，{元素1,元素2}};
         * */

        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}};
        // 建议把每一个一维数组单独写一行
        // 注意：每个一维数组其实是二维数组的元素，所以每个以为数组都需要逗号隔开
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9}
        };
        // 2.获取元素
        // arr[i][j]
        // i: 二维数字的索引，获取出来的是里面的一维数组
        // j: 表示一维数组的索引，获取出来就是真正的元素

        //  二维数组遍历
        // 外循环: 遍历二维数组，得到里面的每一个一维数组
        for (int i = 0; i < arr1.length; i++) {
            // i: 表示二维数组中的每一个索引
            // arr1[i]: 表示二维数组中的每个元素（一维数组）
            for (int j = 0; j < arr1[i].length; j++) {
                // 内循环 ：遍历一维数组,得到里面的每一位元素
                // j: 表示以为数组中的每一个元素
                System.out.print(arr1[i][j] + " ");
            }
        }
        System.out.println();
    }

    // 动态二维数组
    private static void getRunTwoDimensionalArray() {
        /*
         * 二维数组动态初始化格式:
         *                   数组类型[][] 数组名 = new 数据类型[m][n];
         *                   m表示这个二维数组可以存放多少个一维数组
         *                   n表示每个一维数组中可以存放多少个元素
         * */

        // 1.利用动态初始化创建二维数组
        int[][] arr1 = new int[3][5];
        String[][] arr2 = new String[3][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                System.out.println("请输出第" + (i + 1) + "个一维数组中的第" + (j + 1) + "元素");
                arr1[i][j] = sc.nextInt();
                System.out.println("请输出第" + (i + 1) + "个一维数组中的第" + (j + 1) + "元素");
                arr2[i][j] = sc.next();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
                System.out.print(arr2[i][j] + " ");
            }
        }

    }


    // 二维数组练习
    private static void getTwoDimensionalArrayTest() {
        /*
         * 某商城每个季度的营业额如下：单位（万元）
         *   第一个季度:22,66,44  一维数组
         *   第二个季度:77,33,88  一维数组
         *   第三个季度:22,45,65  一维数组
         *   第四个季度:11,66,99  一维数组
         *
         *
         *       计算出每个季度销售总额和全年的总营业额
         * */

        // 1.创建一共二维数组并存储数据
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {22, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            // i 二维数组中的每一个索引
            // yearArr[i] 元素（每个一维数组）
            int[] quarterArr = yearArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第"+(i+1)+"个季度总营业额:"+sum);
            yearSum +=sum;
        }
        System.out.println("全年总营业额:"+yearSum);
    }

    //定义一共方法, 计算每个季度的营业额
    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}