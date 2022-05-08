package Study_extends;

/*1. 定义父类Person类,添加姓名,年龄成员变量,添加吃饭,睡觉方法
2. 定义Coder类继承Person类,添加敲代码方法
3. 定义Teacher类继承Person类,添加上课方法
4. 在测试类中，创建Code对象,并设置成员变量的值,调用Coder对象的eat,sleep,coding方法.创建Teacher对象,并设置成员变量的值,调用Teacher对象的eat,sleep,teach方法*/

class Person{
    private String name;
    private int age;

    Person(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("父类构造器调用");
    }
    public void eat(){
        System.out.println(name+"eat launch");
    }

    public void sleep(){
        System.out.println(name+"sleep");
    }
}

class Teacher extends Person{
    Teacher(){}

    Teacher(String name,int age){
        super(name,age);
    }

    public void Teaching(){
        System.out.println(getName()+"老师上课");
    }
}

class Coder extends Person{
    Coder(){}

    Coder(String name,int age){
        super(name,age);
    }

    public void writeCode(){
        System.out.println(getName()+"Write code");
    }
}
public class Test1{
    public static void main(String[] args) {
        Coder C=new Coder("pyou",22);
        C.writeCode();
        C.sleep();

        Teacher T=new Teacher("PYOU",22);
        T.Teaching();;
        T.sleep();
    }
}
