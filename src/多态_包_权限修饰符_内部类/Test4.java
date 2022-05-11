package 多态_包_权限修饰符_内部类;

/*
    语法点：接口，多态
    定义一个父类Animal 包含name,weight属性和一个抽象的eat方法, 定义两个子类Dog和Cat,Dog特有方法
    lookHome,Cat特有方法catchMouse;并且重写eat方法,Dog吃骨头,Cat吃鱼 要求:使用多态形式创建Dog和Cat对 象,调用eat方法,并且使用向下转型,如果是Cat类型调用catchMouse功能,如果是Dog类型调用lookHome功能
    按步骤编写代码，

*   1. 定义抽象类Animal
    2. 在抽象类Animal中包含name,weight属性和一个抽象的eat方法
    3. 定义Cat类继承Animal类 4. 在Cat类中重写eat方法
    5. 在Cat类中定义catchMouse方法
    6. 定义Dog类继承Animal类 7. 在Dog类中重写eat方法
    8. 在Dog类中定义lookHome方法
    9. 使用多态创建狗对象d
    10. 使用多态创建猫对象c
    11. 调用d对象的eat方法
    12. 调用c对象的eat方法
    13. 使用instanceof判断d对象是否是Dog类
    14. 如果d对象是Dog类,将d对象向下转型为Dog类型,并调用lookHome方法
    15. 使用instanceof判断c对象是否是Cat类
    16. 如果c对象是Cat类,将c对象向下转型为Cat类型,并调用catchMouse方法
* */

public class Test4 {
    public static void main(String[] args) {
        Animal d=new Dog();
        Animal c=new Cat();

        d.eat();
        c.eat();

        if(d instanceof Dog){
            ((Dog) d).lookHome();
        }
        if (c instanceof Cat) {
            ((Cat) c).catMouse();
        }
    }
}

abstract class Animal{
    private String name;
    private int weight;

    abstract void eat();
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("狗吃骨头");
    }

    void lookHome(){
        System.out.println("老老实实看家");
    }

}

class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("猫吃鱼");
    }

    void catMouse(){
        System.out.println("努力抓老鼠");
    }
}