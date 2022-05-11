package 多态_包_权限修饰符_内部类;

/*
* 语法点：匿名内部类使用
请编写一个接口Phone,两个抽象方法,call() sendMessage() 使用匿名内部类的方式调用 call 和 sendMessage方 法
* */

public class Test2 {
    public static void main(String[] args) {
        Phone p=new Phone() {
            @Override
            public void call() {
                System.out.println("打电话");
            }

            @Override
            public void sendMessage() {
                System.out.println("发信息");
            }
        };

        p.call();
        p.sendMessage();
    }
}

interface Phone{
    void call();
    void sendMessage();
}
