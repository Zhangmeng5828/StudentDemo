package cn.itcast.day_5.GirlFriend;

/**
 * @Author:mengzhang
 * @Date:2024/07/24/下午10:30
 */
public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;


    // 根据每个私有的成员变量，都要提供get和set方法
    // set方法: 给成员变量赋值
    // get方法: 对外提供成员变量的值

    // 给name成员变量赋值
    // 对外提供成员变量name的值
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // 给age成员变量赋值
    // 对外提供成员变量age的值
    public void setAge(int age){
        if(age>=18 && age<=30){
            this.age=age;
        }else {
            System.out.println("非法数据");
        }
    }
    public int getAge(){
        return age;
    }

    // 给Gender成员变量赋值
    // 对外提供成员变量Gender的值
    public void setGender(String gender){
        this.gender= gender;
    }
    public String getGender(){
        return gender;
    }


    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
    public void playGame(){
        System.out.println("女朋友在玩游戏");
    }
}
