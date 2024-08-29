package cn.itcast.TestClass;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author:mengzhang
 * @Date:2024/07/23/下午10:02
 */
public class Test9_双色球彩票系统 {
    public static void main(String[] args) {
        // 1.生成中奖号码
         int[]  arr= createNumber();


         System.out.println("=============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

         // 2.用户输入彩票号码
        int[]  useArr=userInputNumber();
        System.out.println("=============================");
        for (int i = 0; i < useArr.length; i++) {
            System.out.print(useArr[i]+" ");
        }
        System.out.println();
        // 3.判断用户中奖情况
        int redCount=0;
        int blueCount=0;


        // 判断红球
        for(int i=0;i<useArr.length-1;i++){
            int redNumber=useArr[i];
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==redNumber){
                    redCount++;
                    // 找到数字就跳出
                    break;
                }
            }
        }

        int blueNumber= useArr[useArr.length-1];
        if(blueNumber==arr[arr.length-1]){
            blueCount++;
        }
        if(redCount==6 && blueCount==1){
            System.out.println("恭喜中得一等奖:1000万");
        }else if(redCount==6 && blueCount==0){
            System.out.println("恭喜中得二等奖:500万");
        }else if(redCount ==5 && blueCount==1){
            System.out.println("恭喜中得三等奖:3000元");
        }else if((redCount==5 && blueCount==0) || (redCount==4 && blueCount==1)){
            System.out.println("恭喜中得四等奖:200元");
        }else if((redCount==4 && blueCount==0) || (redCount==3 && blueCount==1)){
            System.out.println("恭喜中得五等奖:10元");
        }else if((redCount==2 && blueCount==1) || (redCount==1 && blueCount==1) || (redCount==0 && blueCount==1)){
            System.out.println("恭喜中得六等奖:5元");
        }else {
            System.out.println("谢谢参与");
        }
    }



    public static int[] userInputNumber(){
        //1.创建一共数组用于存储用户号码
        // 6个红球 1个篮球    数字长度为7
        int[] arr = new int[7];
        // 2.键盘录入用户彩票号码
        Scanner sc = new Scanner(System.in);
        // 3.提醒用户输入红球号码
        for(int i=0;i<arr.length - 1;){
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                if(!contains(arr,redNumber)){
                    arr[i] = redNumber;
                    i++;
                }else {
                    // 存在
                    System.out.println("红球号码已经存在，请重新输入"+(i+1)+"红球号码");
                }
            }
        }

        // 4.提醒用户输入蓝号码
        System.out.println("请输入篮球号码:");
        while(true){
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else {
                System.out.println("蓝球号码超出范围，请重新输入:");
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        //1.创建一共数组用于存储中奖号码
        // 6个红球 1个篮球    数字长度为7
        int[] arr = new int[7];

        Random random = new Random();
        for (int i = 0; i < arr.length - 1;) {
            int redNumber = random.nextInt(33) + 1;
            if (!contains(arr,redNumber)) {
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = random.nextInt(16) + 1;
        arr[arr.length -1] = blueNumber;




        return arr;

    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
