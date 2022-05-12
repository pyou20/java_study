package 多态_包_权限修饰符_内部类;

/*
开发提示：
    1. 定义员工Employee类。包含属性：姓名，薪资
    2. 定义经理Manager类继承Employee类 3. 定义程序员Coder类继承Employee类 4. 定义Money接口，提供抽象方法paySalary,参数为Employee
    5. 定义公司Company类，实现Money接口,Company类包含公司总资金属性
    6. 定义测试类，创建Company对象，Manager对象，Coder对象，调用公司paySalary方法，给Manager和
    Coder发工资
编写步骤
    1. 定义Employee类,包含属性：姓名，薪资
    2. 定义经理Manager类继承Employee类 3. 定义程序员Coder类继承Employee类 4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)
    5. 定义Company类,实现Money接口,Company类包含公司总资金属性
    6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资
    7. 在main方法中创建Manager对象m 8. 在main方法中创建Coder对象c 9. 在main方法中创建Company对象
    10. 在main方法中调用Company的paySalary方法,传入m和c对象
* */

public class Test6 {
    public static void main(String[] args) {
        Manage m=new Manage("张小强",9000);
        Coder c=new Coder("李小亮",5000);
        Company cp=new Company(1000000);
        cp.paySalary(m);
        cp.paySalary(c);
    }
}

class Employee_T6{
    private String name;
    private float salary;


    public Employee_T6(){}
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Employee_T6(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manage extends Employee_T6{
    public Manage() {super();}

    public Manage(String name, int salary) {
        super(name, salary);
    }
}

class Coder extends Employee_T6{
    public Coder() {
    }

    public Coder(String name, int salary) {
        super(name, salary);
    }
}

interface Money{
    void paySalary(Employee_T6 e);
}

class Company implements Money{
    private float allMoney;

    public Company() {}

    public Company(float allMoney) {
        this.allMoney = allMoney;
    }

    @Override
    public void paySalary(Employee_T6 e) {
        allMoney=allMoney-e.getSalary();

        System.out.println("给" +
                e.getName()+"发工资 " +e.getSalary()+
                "元，公司剩余:"+allMoney);
    }
}
