package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo;

import java.util.ArrayList;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class StudentUtil {
    private StudentUtil() {}


    public static int getMaxStudent(ArrayList<Student> list){
        int max = list.get (0).getAge ();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get (i).getAge ();
            if (age > max) {
                max = age;
            }
        }
        return max;
    }
}
