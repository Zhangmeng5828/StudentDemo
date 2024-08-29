package cn.itcast.day_2.loop;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午9:15
 */
public class Demo6 {
    public static void main(String[] args) {
        //打印
        /*
            *****
            *****
            *****
            *****
         */

        // 外层循环控制打印行数
        /*for (int i = 0; i < 5; i++) {
        //内层循环控制打印次数
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //打印平行四边形
        /*for (int i = 0; i < 5; i++) {
            for (int j = 4-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // 打印三角形

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 5-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        //打印 菱形
        /*
         *
        ***
       *****
      *******
       *****
        ***
         *
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 4-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0 ; i--) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = i*2 -1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
