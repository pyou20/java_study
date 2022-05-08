package Study_extends;

/*
* 1. 定义父类Animal类,添加姓名,年龄,价格成员变量,添加吃饭方法
2. 定义Dog类继承Animal类,添加看家方法
3. 定义Cat类继承Animal类,添加抓老鼠方法
4. 在测试类中，创建Dog对象,并设置成员变量的值,调用Dog对象的eat,lookHome方法.创建Cat对象,并设置成员变量的值,调用Cat对象的eat,catchMouse方法
* */

class Animal{
    private String name;
    private String color;
    private int value;

    public Animal(){}
    public Animal(String name, String color, int value) {
        this.name = name;
        this.color = color;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public void eat(){
        System.out.println(name+"吃饭");
    }
}

class Dog extends Animal{
    public Dog(String name,String color,int value){
        super(name,color,value);
    }

    public void lookHome(){
        System.out.println(getName()+"是一只"+getColor()+"的价值"+getValue()+"的会看家的狗");
    }
}

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, int value) {
        super(name, color, value);
    }

    public void catchMouse(){
        System.out.println(getName()+"是一只"+getColor()+"的价值"+getValue()+"的会抓老鼠的猫");
    }
}



public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog("大黄","黄色",1000);
        dog.eat();
        dog.lookHome();;
        System.out.println(" ");

        Cat cat=new Cat("小咪","白色",2000);
        cat.eat();
        cat.catchMouse();
    }
}
