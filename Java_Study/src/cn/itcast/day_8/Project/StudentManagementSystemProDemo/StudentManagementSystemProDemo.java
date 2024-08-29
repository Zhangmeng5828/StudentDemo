package cn.itcast.day_8.Project.StudentManagementSystemProDemo;

import cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/08/15/下午10:30
 */
public class StudentManagementSystemProDemo {
    public static void main() {
        /**创建学生管理系统
        *创建学生集合
        *循环显示菜单
        *根据用户选择，执行不同的操作
        *退出系统
        *添加学生
        *删除学生
        *修改学生
        *查询学生
         */
        ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list = new ArrayList<>();
         while (true) {
            System.out.println("------------学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.print("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> addStudent(list);
                case 2 -> deleteStudent(list);
                case 3 -> updateStudent(list);
                case 4 -> queryStudent(list);
                case 5 -> {
                    System.out.println("退出系统");
                    // break loop;  给while取个名字叫loop ，然后break loop直接退出while循环
                    System.exit(0);
                }
                default -> System.out.println("输入有误，没有这一选项");
            }
        }
    }

    /**
     * 添加学生
     * @param list
     */
    public static void addStudent(ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list){
        Scanner scanner = new Scanner(System.in);
        loop : while (true) {
            System.out.println("----------添加学生----------");
            System.out.println("请输入学生学号：");
            String id = scanner.next();
            if (contains(list,id)){ //判断学号是否重复
                System.out.println("学号重复，请重新输入");

            }else {
                System.out.println("请输入学生姓名：");
                String name = scanner.next();
                System.out.println("请输入学生年龄：");
                int age = scanner.nextInt();
                System.out.println("请输入学生家庭住址：");
                String address = scanner.next();
                cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student student = new cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student(id, name, age, address);
                list.add(student);
                System.out.println("添加成功");
            }
            System.out.println("是否继续添加？（yes/no）");
            String isContinue = scanner.next();
            if (isContinue.equals("no")){ //判断是否继续添加
                break loop;
            }

        }
    }
    /**
     * 删除学生
     * @param list
     */
    public static void deleteStudent(ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list) {
        Scanner scanner = new Scanner(System.in);
        if (list.size() == 0){
            System.out.println("没有学生信息");
        }else {
            loop:while (true) {
                System.out.println("----------删除学生----------");
                System.out.println("请输入要删除的学生学号：");
                String id = scanner.next();
                if (contains(list,id)) { //判断学号是否存在
                    System.out.println("学号存在");
                    System.out.println("请确认是否删除？（yes/no）");
                    String isDelete = scanner.next();
                    if (isDelete.equals("yes")) {
                        list.remove(getIdex(list, id));
                        System.out.println("删除成功");
                        System.out.println("是否继续删除？（yes/no）");
                        String isContinue = scanner.next();
                        if (isContinue.equals("no")){ //判断是否继续添加
                            break loop;
                        }
                    }
                }else{
                    System.out.println("学号不存在，请重新输入");
                }
            }
        }
    }
    /**
     * 修改学生
     * @param list
     */
    public static void updateStudent(ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list){
        if (list.size() == 0) {
            System.out.println("没有学生信息");
        }else {
            loop : while (true) {
                System.out.println("----------修改学生----------");
                System.out.println("请输入要修改的学生学号：");
                Scanner scanner = new Scanner(System.in);
                String id = scanner.next();
                if (contains(list, id)) { //判断学号是否存在
                    System.out.println("学号存在");
                    System.out.println("请输入学生姓名：");
                    String newname = scanner.next();
                    System.out.println("请输入学生年龄：");
                    int newage = scanner.nextInt();
                    System.out.println("请输入学生家庭住址：");
                    String newaddress = scanner.next();
                    Student student = new Student(id, newname, newage, newaddress);
                    list.set(getIdex(list, id), student);
                    System.out.println("修改成功");
                    System.out.println("是否继续修改？（yes/no）");
                    String isContinue = scanner.next();
                    if (isContinue.equals("no")){ //判断是否继续添加
                        break loop;
                    }
                }else {
                    System.out.println("学号不存在，请重新输入");
                }
            }
        }
    }

    /**
     * 查询学生
     * @param list
     */
    public static void queryStudent(ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list){
        if (list.size() == 0){
            System.out.println("没有学生信息");
        }else {
            System.out.println("学号\t姓名\t年龄\t家庭住址");
            for (cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student student : list)
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    public static boolean contains(ArrayList<cn.itcast.day_8.Project.StudentManagementSystemDemo1.Student> list, String id) {
        /*for (Student student : list){
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIdex(list,id) != -1;
    }

    public static int getIdex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
