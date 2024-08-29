package cn.itcast.day_2.loop;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:56
 */
public class Demo3 {
    public static void main(String[] args) {
        //for循环只适用循环次数固定的循环

        //  输出100遍  键盘敲烂 月薪过万

        int i = 0;
//        while (i < 100) {
//            System.out.println("键盘敲烂 月薪过万");
//            i+=1;
//        }
        for (i = 0; i < 100; i++) {
            System.out.println("键盘敲烂 月薪过万");
        }
    }
}
