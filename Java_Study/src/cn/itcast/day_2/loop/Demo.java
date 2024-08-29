package cn.itcast.day_2.loop;

/**
 * @Author:mengzhang
 * @Date:2024/07/21/下午8:12
 */
public class Demo {
    public static void main(String[] args) {

        //  循环四大特点:
        //  循环变量
        //  循环操作
        //  循环条件
        //  循环变量的更新（出口）

        //Java中的循环一共分为三种
        // while     do-while   for

        // 1.写100遍好好学习，天天向上！！！
        // i = 0  写100遍好好学习，天天向上！！！ i<=100  i++
        // 语法 while(结果为boolean类型的变量或表达式)
        int i = 1;
        while (i <= 100) {
            System.out.println("第"+i+"遍打印:好好学习，天天向上！！！");
            i+=1;
        }

        // 2.打印50分试卷
        // i = 0    打印试卷    i <=50 i++
        int j = 0;
        while (j <= 50) {
            System.out.println("打印试卷");
            j+=1;
        }

        // 3.围操场跑10000米
        // i =0 跑圈 i<=10000 i+=400
        int k = 0;
        int p = 0;
        while (k <= 10000) {

            p+=1;
            System.out.println("第"+p+"次围着操场跑圈");
            k+=400;
        }
        // 4. 做100到编程题
        // i =0 做编程题 i <=100 i+=1
       int l = 0;
        while (l <= 100) {
            System.out.println("第"+l+"遍做编程题");
            l+=1;
        }
    }
}
