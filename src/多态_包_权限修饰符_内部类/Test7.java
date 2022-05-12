package 多态_包_权限修饰符_内部类;

/*
* 模拟各种商品添加到购物车，电子商品打8.8折优惠，展示所有商品信息。
    * 定义购物车类。
        使用ArrayList作为成员变量，保存各种商品对象。
        提供添加商品，移除商品，计算总价的方法。
        定义商品类Goods，包含商品名称，id，价格等属性。
        定义电子商品类EGoods继承Goods。
        定义笔记本类Laptop继承电子商品EGoods类。
        定义手机类继承继承电子商品EGoods类类。
        定义水果类Fruit继承商品类。

    编写步骤
        1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性
        2. 定义EGoods继承Goods类 3. 定义Phone继承EGoods类 4. 定义Laptop继承EGoods类 5. 定义Fruit继承Goods类 6. 定义购物车类GouWuChe
        7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
        8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存到
        ArrayList集合中
        9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品
        信息并打印
        10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价
        格,并输出
        11. 在main方法中创建GouWuChe对象gouWuChe
        12. 在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
        13. 在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
        14. 在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
        15. 调用购物车的addGoods方法将3个商品添加到购物车中
        16. 调用购物车的showGoods方法,显示购物车中的商品信息
        北京市昌平区建材城西路金燕龙办公楼一层 电话：400-618-9090
        17. 调用购物车的total方法,显示购物车中所有商品的价格
* */

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        GouWuChe gouWuChe=new GouWuChe();
        Laptop laptop=new Laptop("g10000","笔记本",10000);
        Phone_T7 phone_t7=new Phone_T7("g10001","手机",5000);
        Fruit fruit=new Fruit("g20000","苹果",50);

        System.out.println("========添加商品=========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone_t7);
        gouWuChe.addGoods(fruit);

        gouWuChe.showGoods();

        gouWuChe.total();
    }
}

class Goods{
    private String id;
    private String name;
    private float price;

    public Goods(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

class EGood extends Goods{
    public EGood(String id, String name, float price) {
        super(id, name, price);
    }


}

class Phone_T7 extends EGood{
    public Phone_T7(String id, String name, float price) {
        super(id, name, price);
    }
}

class Laptop extends EGood{
    public Laptop(String id, String name, float price) {
        super(id, name, price);
    }
}

class Fruit extends Goods{
    public Fruit(String id, String name, float price) {
        super(id, name, price);
    }
}

class GouWuChe{
    private ArrayList<Goods> goods=new ArrayList<Goods>();

    public GouWuChe() {}

    public void addGoods(Goods goods){
        this.goods.add(goods);
        System.out.println("加入"+goods.getName()+"成功！");

    }

    public void showGoods(){
        System.out.println("========打印商品=========");
        System.out.println("你选购的商品为：");
        for(int i=0;i< goods.size();i++){
            System.out.println(goods.get(i).getId()
                    +goods.get(i).getName()
                    +goods.get(i).getPrice());
        }
    }

    public void total(){
        float price=0;
        System.out.println("--------------------");
        for(int i=0;i< this.goods.size();i++){
            price+=this.goods.get(i).getPrice();
        }

        System.out.println("原 价为："+price+"元\n折后价为："+price*0.88);
    }

}