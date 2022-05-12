package 多态_包_权限修饰符_内部类;

/*


*   1. 定义Person类 2. Person类包含name,age属性和抽象的eat方法
    3. 定义Sport接口,包含playBasketball方法
    4. 定义Teacher类继承Person类,重写抽象方法eat()
    5. 定义SportTeacher类继承Teacher类,实现Sport接口,重写Sport接口中的playBasketball方法
    6. 定义Student类继承Person类,重写抽象方法eat()
    7. 定义SportStudent类继承Student类,实现Sport接口,重写Sport接口中的playBasketball方法
    8. 在测试类中定义静态的goToSport方法,参数为Sport接口类型
    9. 在main方法中创建普通的老师t1,姓名为马云,年龄为45岁
    10. 在main方法中创建会打篮球的老师t2,姓名为大姚,年龄为35岁
    11. 在main方法中创建普通的学生s1,姓名为小王,年龄为20
    12. 在main方法中创建会打篮球的学生s2,姓名为王中王,年龄为21
    13. 在main方法中调用goToSport方法.传入t1,t2,s1,s2四个对象.我们会发现只有实现Sport接口的对象才能传
    入
* */

public class Test5 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("马云",45);
        sportTeacher t2=new sportTeacher("大姚",35);
        Student s1=new Student("小王",20);
        sportStudent s2=new sportStudent("王中王",21);

        goToSport(t2);
        goToSport(s2);

    }
    static void goToSport(Sport s){
        s.playBasketball();
    }
}

abstract class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}

interface Sport{
    void playBasketball();
}

class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("吃工作餐");
    }
}

class sportTeacher extends Teacher implements Sport{

    public sportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball(){
        System.out.println("年龄为" +
                getAge()+"岁 "
                +getName()+"老师打篮球");
    }
}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("吃学生餐");
    }
}

class sportStudent extends Student implements Sport{
    public sportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" +
                            getAge()+"岁 "
                            +getName()+"学生打篮球");
    }
}

