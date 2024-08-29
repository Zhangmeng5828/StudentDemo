package cn.itcast.ObjectOrientedTestClass.GoodsTest;

/**
 * @Author:mengzhang
 * @Date:2024/07/31/上午9:50
 */
public class GoodsTest {
    public static void main(String[] args) {
        // 1.创建一个数字
        Goods[] arr = new Goods[3];

        // 2.创建三个商品对象
        Goods g1 = new Goods("001","华为P50", 7999.0, 100);
        Goods g2 = new Goods("002","小米13", 4999.0, 100);
        Goods g3 = new Goods("003","苹果13", 6999.0, 100);

        // 3.将商品对象放入数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;


        // 4.遍历数组，输出每个商品的信息
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice() + "\t" + goods.getCount());
        }
    }
}
