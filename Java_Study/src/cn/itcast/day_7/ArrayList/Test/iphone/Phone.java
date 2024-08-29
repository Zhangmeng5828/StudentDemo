package cn.itcast.day_7.ArrayList.Test.iphone;

/**
 * @Author:mengzhang
 * @Date:2024/08/14/下午9:13
 */
public class Phone {

    private String brand;
    private int price;


    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "iphone{brand = " + brand + ", price = " + price + "}";
    }
}
