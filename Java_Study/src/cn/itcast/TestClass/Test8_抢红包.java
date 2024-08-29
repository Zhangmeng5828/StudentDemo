package cn.itcast.TestClass;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/23/下午9:19
 */
public class Test8_抢红包 {
    public static void main(String[] args) {
        /*
        *  随机发红包[2,588,888,1000,10000]
        *  2元的奖金被抽出
        * 588元的奖金被抽出
        * 888元的奖金被抽出
        * 1000元的奖金被抽出
        * 10000元的奖金被抽出
         */


        // 分析：
        // 1.定义模拟一个数组表示奖池
        int[] arr = {2,588,888,1000,10000};
        // 2.定义新数组存储抽奖结果
        int[] newArr = new int[arr.length];
        // 抽奖
        Random random = new Random();
        for (int i = 0; i < 5;) {
            // 获取随机索引
            int randomIndex = random.nextInt(arr.length);
            // 获取奖项
            int prize = arr[randomIndex];
            // 判断当前的将是否存在，如果存在继续抽取
            if(!contains(newArr, prize)) {
                // 把当前元素的奖项添加到newArr
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]+"元的奖金被抽出");
        }


    }

    // 判断prize在数组中存不存在
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
