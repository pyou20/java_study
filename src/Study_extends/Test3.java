package Study_extends;

/*
* * 1. 写一个标准的华为手机类(HWPhone)
  2. 手机属性有: 型号(type),价格(price),颜色(color) ,及静态的品牌(brand)
  3. 手机行为有: 打电话(call)
  4. 写手机测试类(PhoneTest)
  5. 创建手机对象,并设置手机的属性
  6. 打印手机对象的品牌,型号,价格和颜色
  7. 调用手机打电话方法
* */

public class Test3 {
    public static void main(String[] args) {
        HWPhone HW=new HWPhone("p30","白色",3000);
        System.out.println("品牌："+HWPhone.getBrand()+"  颜色："+HW.getColor()+"  价格："+HW.getPrice());
    }
}
class HWPhone{
    private String type;
    private String color;
    private int price;
    private static String brand="HuaWei";

    public HWPhone(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void call(){
        System.out.println("打电话");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public static String getBrand() {
        return brand;
    }
}