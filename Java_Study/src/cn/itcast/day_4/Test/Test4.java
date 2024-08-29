package cn.itcast.day_4.Test;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:15
 */
public class Test4 {
    public static void main(String[] args) {

        // 定义方法： 比较两个长方形的面价
        double area1 = getArea(10,29);
        double area2 = getArea(2,56);
        if(area1>area2){
            System.out.println("第一个长方形大于第二个");
        }else {
            System.out.println("二个长方形大于第一个");
        }

    }

    public static double getArea(double length, double width) {
        return length * width;
    }
}
