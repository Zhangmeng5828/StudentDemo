package cn.itcast.day_4;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午10:47
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        // 方法调用

        playGame();
        playGame();

    }

    // 定义一个方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }



}
