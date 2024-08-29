package cn.itcast.ObjectOrientedTestClass.GirlFriend;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午3:33
 */
public class GirlFriend {
    private String name; //名字
    private int age; //年龄
    private String gender; //性别
    private String hobby; //爱好


    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
