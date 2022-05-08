package Study_abstract;

import java.lang.annotation.ElementType;

public class Test1 {
    public static void main(String[] args) {
        Manger M=new Manger(2000170333,"PYOU",5000);
        System.out.println("工号:"+M.getId()+"\n姓名:"+M.getName()+"\n工资:"+M.getWages());
        M.eat();
        M.job();

        Cook C=new Cook(2000170333,"PYOU",6000);
        System.out.println("工号:"+C.getId()+"\n姓名:"+C.getName()+"\n工资:"+C.getWages());
        C.eat();
        C.job();
    }
}

abstract class Employee{
    private int id;
    private String name;
    private int wages;

    public Employee(){}
    public Employee(int id, String name, int wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWages() {
        return wages;
    }

    abstract void job();

    abstract void eat();
}

class Manger extends Employee{

    public Manger() {}

    public Manger(int id,String name,int wages){
        super(id,name,wages);
    }

    @Override
    void eat() {
        System.out.println("喜欢吃鱼");
    }

    void job(){
        System.out.println("经理的工作管理其他人");
    }
}

class Cook extends Employee{
    public Cook(){}

    public Cook(int id,String name,int wages){
        super(id,name,wages);
    }

    @Override
    void eat(){
        System.out.println("喜欢吃肉");
    }

    void job(){
        System.out.println("厨师的工作是炒菜");
    }
}

