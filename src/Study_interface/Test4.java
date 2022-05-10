package Study_interface;

/*
* 1. 定义方向枚举Orientation，包含EAST, SOUTH, WEST, NORTH四个方向值
2. 定义小汽车Car类，包含String类型的品牌(brand)，Orientation枚举类型的方向(orientation)两个属性
3. 小汽车Car类包含行驶的方法(run)，在run方法中打印某个品牌的车正在往某个方向行驶
4. 定义测试类Test05，并包含main方法
5. 在main方法中创建Car对象，并调用Car对象的run方法
* */
public class Test4 {
    public static void main(String[] args) {
        Car car=new Car("benz");
        car.run(Orientation.EAST);
    }
}

enum Orientation{
    EAST,SOUTH,WEST,NORTH;
}

class Car{
    private String brand;
    Orientation orientation;

    public Car(String brand){
        this.brand=brand;
    }
    public Car(String brand, Orientation orientation) {
        this.brand = brand;
        this.orientation = orientation;
    }

    void run(Orientation orientation){
        System.out.println("一辆"+brand+"车向"+orientation+"方向行驶");
    }
}