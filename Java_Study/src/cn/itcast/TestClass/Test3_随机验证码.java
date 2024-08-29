package cn.itcast.TestClass;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/下午10:53
 */
public class Test3_随机验证码 {
    public static void main(String[] args) {
        /*  需求：
                定义方法实现随机产生一个五位数的验证码
                验证码格式：
                长度5
                前四位是大写字母或小写字母
                最后一位是数字
        * */

        // 分析：
        // 1.随机     A ~ Z   a ~ z
        // 方法：
        // 1.将大小写字母方法数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII码表
            if(i < 25){
                // 添加小写字母
                chs[i] = (char)(97 + i);
            }else {
                // 添加大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }

        // 定义 一共字符串类型的变量，用来记录最终结果
        String result = "";


        // 2.随机抽取4次
        // 随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            // 利用随机索引,获取对应元素
            // System.out.println(chs[randomIndex]);
            result += chs[randomIndex];
        }
        // 3.随机抽取一共数字0 ~ 9
        int number = r.nextInt(10);
        // 生成最总结果
        result += number;
        System.out.println(result);
    }

}
