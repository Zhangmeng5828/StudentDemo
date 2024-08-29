package cn.itcast.ObjectOrientedTestClass.GameTest_2;

import java.util.Random;

/**
 * @Author:mengzhang
 * @Date:2024/07/30/下午11:15
 */
public class Hero {
    private String name;//姓名
    private int blood;//血量
    private char gender;//性别
    private String face;//长相   长相是随机的


    String[] boyfaces = {"风流俊朗", "玉树临风", "气宇轩昂", "相貌英俊", "气吞山河", "相貌平平", "一塌糊涂"};
    String[] girlfaces = {"沉鱼落雁", "闭月羞花", "婷婷玉立", "相貌平平", "如花似玉", "花容月貌", "其貌不扬"};

    // attack 攻击描述
    String[] attack_desc = {
             "%s使出了一招【背心钉】，转到对方身后，一掌向%s背心的灵台穴拍去",
             "%s运气于掌，一瞬间掌心通红，一招【掌心雷】，打向%s，速度之快令人目不暇接！",
             "%s使出了一招【降龙十八掌】，威力无比！大的%s练练倒退",
             "%s使出了一招【葵花宝典】，令%s落花流水！",
             "%s使出了一招【如来神掌】，%s直接飞了出去！",
             "%s使出了一招【隔山打牛】，将%s远远地打到了山外！",
             "%s使出了一招【九阴真经】，直接将%s打飞"
    };

    // injured 受伤描述
    String[] injured_desc = {
             "%s被%s的【背心钉】打中，痛得满地打滚",
             "%s被%s的【掌心雷】击中，痛苦地闷哼了一声",
             "%s被%s的【降龙十八掌】击中，口中鲜血狂喷而出",
             "%s被%s的【葵花宝典】打中，眼前一黑，直接晕了过去",
             "%s被%s的【如来神掌】击中，五内俱焚，瞬间昏迷",
             "%s被%s的【隔山打牛】击中，眼前一黑，直接晕了过去",
    };



    public Hero() {
    }

    public Hero(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //调用设置长相的方法
        setFace(gender);
    }
    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }
    /**
     * 设置
     *
     * @return face
     */
    public void setFace(char gender) {
        Random random = new Random();
        // 长相是随机的
        if (gender == '男') {
            // 随机索引
            // 从boyfaces数组中取出一个随机的长相
            int index = random.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            // 随机索引
            // 从girlfaces数组中取出一个随机的长相
            int index = random.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            System.out.println("相貌平平");
        }
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }
    /**
     * 设置
     *
     * @return gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }




    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
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

    public void attack(Hero hero) {
        Random r = new Random();



        // 输出一个攻击效果
        int index = r.nextInt(attack_desc.length);
        String KongFu = attack_desc[index];
        System.out.printf(KongFu, this.getName(), hero.getName());
        System.out.println();

        // 输出一个受伤效果
        index = r.nextInt(injured_desc.length);
        String injured = injured_desc[index];
        System.out.printf(injured, hero.getName(), this.getName());
        System.out.println();

        //计算造成的伤害1~20

        int damage = r.nextInt(20) + 1;

        //剩余血量
        int remainBlood = hero.getBlood() - damage;
        // 如果remainBlood小于0，则将remainBlood赋值为0，否则保持remainBlood的值不变
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改被攻击者的血量
        hero.setBlood(remainBlood);


        //攻击时，输出攻击的动作
        System.out.println(this.getName() + "攻击了" + hero.getName()
                + "，造成了" + damage + "点伤害" + hero.getName() + "剩余血量" + remainBlood);
    }

    public void showHeroInfo() {
        //姓名：盖伦，血量：616，性别：男，长相：一塌糊涂
        System.out.println("姓名：" + this.name + "，血量：" + this.blood + "，性别：" + this.gender + "，长相：" + this.face);
    }

}


