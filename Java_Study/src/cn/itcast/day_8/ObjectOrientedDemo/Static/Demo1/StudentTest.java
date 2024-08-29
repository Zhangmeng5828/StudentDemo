package cn.itcast.day_8.ObjectOrientedDemo.Static.Demo1;

/**
 * @author menegzhang
 * @data 2024/8/18
 * @apiNote
 */
public class StudentTest {
    public static void main(String[] args) {
        Student.tearch = "伟哥";
        Student student = new Student();
        student.setName ("zhangsan");
        student.setAge (18);
        student.setGender ("男");
        student.show ();
        student.study ();

        Student student1 = new Student();
        student1.setName ("lisi");
        student1.setAge (18);
        student1.setGender ("女");
        student1.show ();
        student1.study ();

    }
}
