package cn.itcast.ObjectOrientedTestClass.GameTest_1;

/**
 * @Author:mengzhang
 * @Date:2024/07/30/下午11:13
 */
public class TextVersionFightingGame {
    public static void main(String[] args){
        // 1.创建第一个角色
        Hero h1 = new Hero("乔峰",100);
        // 2.创建第二个角色
        Hero h2 = new Hero("段誉",100);

        // 3.开始格斗 回合制游戏
        while(true){
            // 3.1乔峰攻击段誉
            h1.attack(h2);
            // 3.2判断段誉是否死亡
            if(h2.getBlood()<=0){
                System.out.println("段誉死亡，游戏结束");
                break;
            }
            // 3.3段誉攻击乔峰
            h2.attack(h1);
            // 3.4判断乔峰是否死亡
            if(h1.getBlood()<=0){
                System.out.println("乔峰死亡，游戏结束");
                break;
            }
        }
    }

}
