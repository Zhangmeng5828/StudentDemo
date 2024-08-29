package cn.itcast.ObjectOrientedTestClass.StudentTest;

import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/下午3:52
 */
public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为4的数组，数组存储1~3名学生对象作为出数据，学生对象的学号，姓名各不相同
        * 学生的属性：学号，姓名，年龄
        * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        * 要求2：添加完毕之后，遍历所有学生信息
        * 要求3：通过ID删除学生信息
        * 如果存在，则删除，如果不存在，则提示删除失败
        * 要求4：删除完毕之后遍历所有学生信息
        * 要求5：查询数组ID为“heima001”的学生，如果存在，则将他的年龄+1岁*/

        //1.创建一个数字用来存储学生对象
        Student[] students = new Student[3];
        //2.创建学生对象并赋值
        students[0] = new Student("heima001","赵丽颖",18);
        students[1] = new Student("heima002","高圆圆",17);
        students[2] = new Student("heima003","迪丽热巴",16);


        //3.要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student s = new Student("heima004","刘亦菲",18);

        // 唯一性判断
        // 已存在 ------ 不用添加
        // 不存在 ------ 添加
        if (!contains(students,s.getId())){
            // 将s对象添加到数组中
            // 1.数组已经存满----只能创建一个新的数组，将原来的数组中的元素拷贝到新的数组中，新数组的长度 = 老数组的长度 + 1
            // 2.数组未存满----直接将s对象添加到数组中
            if (getCount(students) == students.length){
                students = createNewArr(students);
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null){
                        students[i] = s;
                        printArr(students);
                        System.out.println();
                    }
                }
            }else {
                // 直接将s对象添加到数组中
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null){
                        students[i] = s;
                        printArr(students);
                        System.out.println();
                    }
                }
            }

        }else {
            System.out.println("学号重复，添加失败");
        }

        // 4.要求3：通过ID删除学生信息
        // 如果存在，则删除，如果不存在，则提示删除失败

        // 找到id在数组中的索引
        int index = getIndex(students,"heima002");
        // System.out.println(index);
        if (index != -1){
            students[index] = null;
            /*要求4：删除完毕之后遍历所有学生信息*/
            printArr(students);
            System.out.println();
        }else {
            System.out.println("当前ID不存在，删除失败");
        }

        // 5.要求5：查询数组ID为“heima001”的学生，如果存在，则将他的年龄+1岁
        // 找到id在数组中的索引
        int index1 = getIndex(students,"heima005");
        // System.out.println(index1);
        if (index1 != -1){
            students[index1].setAge(students[index1].getAge() + 1);

            printArr(students);
            System.out.println();
        }else {
            System.out.println("当前ID不存在，查询失败");
        }

    }


    // 1.我要干嘛？  找到id在数组中的索引
    // 2.我干这件事情需要什么？  数组  id
    // 3.我是否需要给调用处一个返回值？ 需要  索引

    public static int getIndex(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getId().equals(id)) {
                return i;
            }
        }
        return -1; // -1表示没有找到
    }


    // 1.我要干嘛？  遍历打印数组中的学生对象
    // 2.我干这件事情需要什么？  数组
    // 3.我是否需要给调用处一个返回值？ 不需要
    public static void printArr(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getAge());
            }
        }
    }



    // 1.我要干嘛？  创建一个新的数组
    // 2.我干这件事情需要什么？  原来的数组
    // 3.我是否需要给调用处一个返回值？ 需要  新数组
    public static Student[] createNewArr(Student[] students) {
        // 1.创建一个新的数组
        Student[] newStudents = new Student[students.length + 1];
        // 2.将原来的数组中的元素拷贝到新的数组中
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    // 1.我要干嘛？  判断数组中已经存了几个学生对象
    // 2.我干这件事情需要什么？  数组
    // 3.我是否需要给调用处一个返回值？ 需要  数量
    public static int getCount(Student[] students){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                count++;
            }
        }
        return count;
    }




    // 1.我要干嘛？  唯一性判断
    // 2.我干这件事情需要什么？  数组  id
    // 3.我是否需要给调用处一个返回值？ 需要  布尔值
    public static boolean contains(Student[] students,String id){
        for (int i = 0; i < students.length; i++) {
            // 判断数组中的每一个学生对象的id是否与传入的id相同
            if (students[i].getId().equals(id)){
                return true;
            }
        }
        // 遍历完数组，没有找到相同的id，说明不存在
        return false;
    }



}
