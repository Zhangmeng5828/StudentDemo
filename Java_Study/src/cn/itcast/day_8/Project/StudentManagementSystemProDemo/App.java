package cn.itcast.day_8.Project.StudentManagementSystemProDemo;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @Author:mengzhang
 * @Date:2024/08/16/上午12:20
 */
public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1登录  2注册  3忘记密码 4退出App");
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入你的选择：");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> Login(list);
                case 2 -> Register(list);
                case 3 -> ForgetPassword(list);
                case 4 -> {
                    System.out.println("退出App");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    /**
     * 忘记密码方法
     * @param list
     */
    public static void ForgetPassword(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("----------忘记密码----------");
        System.out.print ("请输入用户名:");
        String username = scanner.next();
        if (contain (list,username)){
            int idex = getIndex (list,username);
            String personID = list.get(idex).getPersonID();
            String phoneNumber = list.get(idex).getPhoneNumber();
            System.out.print ("请输入当前用户的身份证号码:");
            String scpersonID = scanner.next ();
            System.out.print ("请输入当前用的手机号码:");
            String scphoneNumber = scanner.next ();
            if (forgetPasswordcontain (personID,scpersonID,phoneNumber,scphoneNumber)){
                loop : while (true) {
                    System.out.print ("请输入新密码:");
                    String newPassword = scanner.next ();
                    System.out.print ("请再次输入密码:");
                    String againnewPassword = scanner.next ();
                    if (passwordcontain (newPassword,againnewPassword)){
                        list.get (idex).setPassword (newPassword);
                        break loop;
                    }else {
                        System.out.println ("两次密码不一致，请重新输入");
                    }
                }
            }else {
                System.out.println ("输入的用身份证号码和手机号码有误");
            }
        }else {
            System.out.println ("该用户不存在,请先去注册");
        }
    }

    /**
     * 注册方法
     * @param list
     */
    public static void Register(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        loop:while (true) {
            System.out.println ("----------注册----------");
            System.out.print ("请输入用户名:");
            String username = scanner.next();
            if (usernamecontain (username) >0){
                if (!contain (list,username)) {
                    while (true) {
                        /*
                        输入两次密码，当两次密码相同才能继续
                         */
                        System.out.println ();
                        System.out.print ("请输入密码:");
                        String password = scanner.next();
                        System.out.println ();
                        System.out.print ("请再次输入密码:");
                        String againpassword = scanner.next();
                        if (passwordcontain (password,againpassword)){
                            while (true) {
                                System.out.println ();
                                System.out.print ("请输入身份证号码:");
                                String personID = scanner.next();
                                if (personIDcontain (personID)){
                                    while (true){
                                        System.out.println ();
                                        System.out.print ("请输入手机号码:");
                                        String phoneNumber = scanner.next();
                                        if (phoneNumbercontain(phoneNumber)){
                                            User user = new User (username,password,personID,phoneNumber);
                                            list.add (user);
                                            break loop;
                                        }else {
                                            System.out.println ("手机号码不合法，请重新输入");
                                        }
                                    }
                                }else {
                                    System.out.println ("身份证号码不合法，请重新输入");
                                }
                            }
                        }else {
                            System.out.println ("两次密码不同，请重新输入");
                        }
                    }
                }else {
                    System.out.println ("用户名已存在，请重新输入");
                }
            }else {
                System.out.println ("用户名不合法，请重新输入");
            }

        }
    }

    /**
     * 登录方法
     * @param list
     */
    public static void Login(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("----------登录----------");
        System.out.print ("请输入用户名:");
        String username = scanner.next();
        if (contain (list,username)) {
            loop:for (int i = 3; i >0 ; i--) {
                int index = getIndex (list,username);
                String usepassword = list.get (index).getPassword ();
                System.out.println ();
                String verificationCode = verificationCode ();
                System.out.println (verificationCode);
                System.out.print ("请输入密码:");
                String password = scanner.next();
                System.out.print ("请输入验证码:");
                String againverificationCode = scanner.next();
                if (Logincontain (usepassword, password, verificationCode, againverificationCode)) {
                    StudentManagementSystemProDemo studentManagementSystemProDemo = new StudentManagementSystemProDemo ();
                    StudentManagementSystemProDemo.main ();
                }else {
                    System.out.println ("密码或验证那码不正确，还有"+(i-1)+"次机会");
                }
            }
        }else {
            System.out.println ("该用户不存在，请先去注册。");
        }
    }

    /**
     * 判断用户名是否存在
     * @param list
     * @param username
     * @return
     */
    public static boolean contain(ArrayList<User> list,String username){
        return getIndex(list,username) != -1;
    }

    /**
     * 如果用户名存在返回其下标
     * @param list
     * @param username
     * @return
     */
    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

    /**
     *
     *判断输入的用户名是否合法
     *长度必须在 3~15之间
     *其中的每一个字符必须在'a'~'z'或'A'~'Z'或'0'~'9'中
     *其次至少有一个字符在'a'~'z'或'A'~'Z'中
     * @param username
     * @return
     */
    public static int  usernamecontain (String username) {
        int count = 0;
        if (username.length() >=3 && username.length() <= 15){
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                    count++;
                }else if (c >= '0' && c <= '9'){
                }
            }
            return count;
        }
        return  -1;
    }

    /**
     * 判断两次密码是否一致
     * @param password
     * @param againpassword
     * @return
     */
    public static boolean passwordcontain(String password, String againpassword){
        if (againpassword.equals(password)){
            return true;
        }
        return false;
    }

    /**
     * 判断身份证号码是否合法
     * @param personID
     * @return
     */
    public static boolean personIDcontain(String personID){
        if (personID.length () != 18){
            return false;
        }else {
            if (personID.charAt (0) =='0'){
                return false;
            }else {
                for (int i = 0; i < 17; i++) {
                    char c = personID.charAt(i);
                    if (!(c >= '0' && c <= '9')){
                        return false;
                    }
                }
                if (!((personID.charAt (17) =='X')||(personID.charAt (17) =='x')||(personID.charAt (17) >='0' && personID.charAt (17) <='9'))){
                    return false;
                }else {
                    return true;
                }
            }
        }
    }

    /**
     * 判断手机号码是否合法
     * @param phoneNumber
     * @return
     */
    public static boolean phoneNumbercontain(String phoneNumber){
        if (phoneNumber.length () != 11 ){
            return false;
        }else {
            if (phoneNumber.charAt (0) =='0'){
                return false;
            }else {
                for (int i = 0; i < phoneNumber.length (); i++) {
                    char c = phoneNumber.charAt(i);
                    if (!(c >= '0' && c <= '9')){
                        return false;
                    }
                }
                return true;
            }
        }
    }


    /**
     * 判断用户输入的密码和验证码是否正确
     * @param userpassword
     * @param password
     * @param verificationCode
     * @param againverificationCode
     * @return
     */
    public static boolean Logincontain(String userpassword,String password, String verificationCode,String againverificationCode ){
        if (userpassword.equals (password) && verificationCode.equalsIgnoreCase (againverificationCode) ){
            return true;
        }
        return false;
    }


    /**
     * 判断用户输入的身份证号码和手机号码是否是当前用户的
     * @param personID
     * @param scpersonID
     * @param phoneNumber
     * @param scphoneNumber
     * @return
     */
    public static boolean forgetPasswordcontain(String personID,String scpersonID,String phoneNumber,String scphoneNumber ){
        if (personID.equals(scpersonID) && phoneNumber.equals(scphoneNumber)){
            return true;
        }
        return false;
    }

    /**
     * 随机生成验证码
     * @return
     */
    public static String verificationCode(){
        char[] arr = {'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T','U','V'
                ,'W','X','Y','Z','a','b','c','d','e','f','g','h'
                ,'i','j','k','l','m', 'n','o','p','q','r','s','t'
                ,'u','v','w','x','y','z'};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 52);
            stringBuilder.append(arr[index]);
        }
        stringBuilder.append((int) (Math.random() * 10));
        return   new String (randomString(stringBuilder.toString()));
    }

    /**
     * 随机打乱验证码
     * @param str
     * @return
     */
    public static String randomString(String str){
        //1.将字符串转换为字符数组
        char[] chars = str.toCharArray();
        //2.打乱字符数组
        for (int i = 0; i < chars.length; i++) {
            int index = (int) (Math.random() * chars.length);
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }
        //3.将字符数组转换为字符串
        return  new String(chars);
    }

}
