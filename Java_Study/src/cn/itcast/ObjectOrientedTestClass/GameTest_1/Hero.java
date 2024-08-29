package cn.itcast.ObjectOrientedTestClass.GameTest_1;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/30/下午11:15
 */
public class Hero {
    private String name;
    private int blood;

    public Hero() {
    }

    public Hero(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一共方法用于攻击别人
    // 思考：谁攻击谁？
    // Hero h1 = new Hero();
    // Hero h2 = new Hero();
    // Hero h1攻击h2
    // 方法的调用者去攻击参数

    public void attack(Hero hero){
        //计算造成的伤害1~20
        Random r = new Random();
        int damage = r.nextInt(20) + 1;

        //剩余血量
        int remainBlood = hero.getBlood() - damage;
        // 如果remainBlood小于0，则将remainBlood赋值为0，否则保持remainBlood的值不变
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改被攻击者的血量
        hero.setBlood(remainBlood);


        //攻击时，输出攻击的动作
        System.out.println(this.getName() + "攻击了" + hero.getName()
        + "，造成了" + damage + "点伤害"+hero.getName()+"剩余血量"+remainBlood);
    }

}


