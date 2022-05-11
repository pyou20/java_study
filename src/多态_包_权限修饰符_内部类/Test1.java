package 多态_包_权限修饰符_内部类;

/*
* 语法点：匿名内部类使用
根据需求，完成如下代码，并在测试类中进行测试。
*
* 员工类 Employee: 属性: 姓名 工号 工资 抽象方法: 工作(work), 开会(meet)
使用匿名内部类方式创建一个员工类,并调用其工作和开会的功能
* */

public class Test1 {
    public static void main(String[] args) {
        Employee e=new Employee() {
            @Override
            void work() {
                System.out.println("工作");
            }

            @Override
            void meet() {
                System.out.println("开会");
            }
        };

        e.work();
        e.meet();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private int salary;

    abstract void work();

    abstract void meet();
}



