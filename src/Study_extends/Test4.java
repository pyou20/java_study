package Study_extends;

/*
* 1. 模拟教学管理系统师生信息
2. 定义Person类
   1. 属性：姓名(私有)、年龄(私有)
   2. 构造方法：无参构造方法，有参构造方法
   3. 成员方法：getXxx方法，setXxx方法
3. 定义Teacher类，继承Person
   1. 属性：学科(私有)
   2. 构造方法：无参构造方法，有参构造方法
   3. 成员方法：getXxx方法，setXxx方法，讲课方法
4. 定义Student类，继承Person
   1. 属性：分数(私有)
   2. 构造方法：无参构造方法，有参构造方法
   3. 成员方法：getXxx方法，setXxx方法，考试方法
* */

public class Test4 {
    public static void main(String[] args) {
        Teacher_T4 T=new Teacher_T4("PYou",22,"math");
        System.out.println(T.getName()+","+T.getAge()+"岁"+"教"+T.getObject());
        T.Teaching();

        Student_T4 S=new Student_T4("PYOU20",22,60);
        System.out.println(S.getName()+","+S.getAge()+"岁"+"考了"+S.getCore()+"分");
        S.wayForExam();
    }

}

class Person_T4 {
    private String name;
    private  int age;

    public Person_T4(){}

    public Person_T4(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher_T4 extends Person_T4 {
    private String object;

    public Teacher_T4(String object) {
        this.object = object;
    }

    public Teacher_T4(String name, int age, String object) {
        super(name, age);
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void Teaching(){
        System.out.println("讲课");
    }
}

class Student_T4 extends Person_T4 {
    private double core;

    public Student_T4(double core) {
        this.core = core;
    }

    public Student_T4(String name, int age, double core) {
        super(name, age);
        this.core = core;
    }

    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public void wayForExam(){
        System.out.println("考试方法");
    }
}