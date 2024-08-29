package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/上午10:22
 */
public class StringDemoTest_敏感词屏蔽 {
    public static void main(String[] args) {
        // 1.获取你说的话
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 2.定义敏感词数组
        String[] arr = {"苍老师","东京热","武大郎","拆东墙","偷西厢"
                ,"老牛吃草","老马吃草","老王吃草","我草","草泥马","草泥"
        ,"TMD","草你妈"};

        // 3.遍历敏感词数组
        for (int i = 0; i < arr.length; i++) {
            // 4.判断str中是否包含敏感词
            if(str.contains(arr[i])){
                // 5.替换敏感词
                str = str.replaceAll(arr[i],"***");
            }
        }
        System.out.println(str);

    }
}
