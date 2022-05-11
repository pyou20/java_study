package 多态_包_权限修饰符_内部类;

/*
* 语法点：匿名内部类使用
请编写一个接口 Player,包含 playBasketball,playPingpong 2 个抽象方法,在测试类中使用匿名 内部类方式创建
对象,并调用这 2 个功能
* */

public class Test3 {
    public static void main(String[] args) {
        Player p=new Player() {
            @Override
            public void playBasketball() {
                System.out.println("打篮球");
            }

            @Override
            public void playPingpong() {
                System.out.println("打乒乓球");
            }
        };
    }
}

interface Player{
    void playBasketball();
    void playPingpong();
}