package cn.itcast.day_6.StringDemo.Test;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/10/上午9:34
 */
public class StringDemoTest3_身份证信息查看 {
    public static void main(String[] args) {
        /**
         * 身份证号查看
         * 身份证号是18位，前17位是数字，最后一位是校验码，校验码可能是数字也可能是字母
         * 校验码是前17位数字和字母的余数
         * 余数是0-9，则校验码就是0-9
         * 余数是10，则校验码就是X
         * 校验码的算法：
         * 1. 将身份证号前17位分别乘以系数，系数依次是：7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2
         * 2. 将乘积相加
         * 3. 将和除以11，取余数
         * 4. 根据余数，判断校验码
         * 5. 如果校验码是X，则用大写字母X表示
         * 6. 如果校验码是数字，则用数字表示
         * 7. 如果校验码不正确，则身份证号不合法
         * 8. 如果校验码正确，则身份证号合法
         * 9. 输出身份证号是否合法
         * 10. 输出校验码
         * 11. 输出出生日期
         * 12. 输出性别
         * 13. 输出地区
         * 14. 输出年龄
         * 15. 输出星座
         * 16. 输出生肖
         * 17. 输出血型
         */


        // 1.输入身份证号
        Scanner scanner = new Scanner(System.in);

        String id = scanner.next();

        // 2.获取出生日期
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("人物信息：");
        System.out.println("出生年月日"+year + "年" + month + "月" + day + "日");


        // 3.获取性别
        char sex = id.charAt(16);
        if (sex % 2 == 0) {
            System.out.println("性别：女");
        } else {
            System.out.println("性别：男");
        }



    }
}
