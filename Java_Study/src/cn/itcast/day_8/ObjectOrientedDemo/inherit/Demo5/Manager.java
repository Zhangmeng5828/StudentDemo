package cn.itcast.day_8.ObjectOrientedDemo.inherit.Demo5;

/**
 * @author menegzhang
 * @data 2024/8/24
 * @apiNote
 */
public class Manager extends Employee {


    private double bonus;

    public Manager () {
    }


    public Manager (String name, int age, double salary, double bonus) {
        super (name, age, salary);
        this.bonus = bonus;
    }

    public Manager (double bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus () {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus (double bonus) {
        this.bonus = bonus;
    }




    @Override
    public void work (){
        System.out.println("管理其他人");
    }

    public String toString () {
        return  super.toString() +"Manager{bonus = " + bonus + "}";
    }
}
