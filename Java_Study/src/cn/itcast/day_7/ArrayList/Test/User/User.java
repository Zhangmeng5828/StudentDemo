package cn.itcast.day_7.ArrayList.Test.User;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午8:43
 */
public class User {
    private String id;
    private String userName;
    private String passWord;


    public User() {
    }

    public User(String id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", passWord = " + passWord + "}";
    }
}
