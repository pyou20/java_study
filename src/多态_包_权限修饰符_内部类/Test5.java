package 多态_包_权限修饰符_内部类;

public class Test5 {
    public static void main(String[] args) {

    }
    static void goToSport(Sport s){

    }
}

abstract class Person{
    private String name;
    private int age;

    abstract void eat();
}

interface Sport{
    void playBasketball();
}

class Teacher extends Person{

    @Override
    void eat() {
        System.out.println("吃工作餐");
    }
}

class sportTeacher implements Sport{
    @Override
    public void playBasketball(){
        System.out.println("老师打篮球");
    }
}

class Student extends Person{

    @Override
    void eat() {
        System.out.println("吃学生餐");
    }
}

class sportStudent implements Sport{

    @Override
    public void playBasketball() {
        System.out.println("学生打篮球");
    }
}

