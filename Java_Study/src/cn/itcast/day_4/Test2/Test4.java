package cn.itcast.day_4.Test2;

/**
 * @Author:mengzhang
 * @Date:2024/07/22/上午11:59
 */
public class Test4 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] copyarr = copyarr(arr, 3, 7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    // 拷贝数组
    public static int[] copyarr(int[] arr,int from,int to){
        // 1.定义数组
        int[] newarr = new int[to-from];
        int index=0;
        for(int i=from;i<to;i++){
            newarr[index] = arr[i];
            index++;
        }
        return newarr;
    }
}
