package Study_interface;

/*
    * 两个手机类OldPhone和NewPhone都有call()和sendMessage()方法.定义接口Play,Play中有一个抽象的玩游戏
    的方法playGame(),NewPhone实现Play接口有玩游戏的功能; 要求:分别测试OldPhone和NewPhone的call()和
    sendMessage()方法,再测试新手机palyGame()的方法
*
* 1. 定义接口Play
2. 在Play中定义一个抽象的玩游戏的方法playGame()
3. 定义OldPhone类 4. 在OldPhone类中定义call()和sendMessage()方法
5. 定义NewPhone类,继承OldPhone,实现Play接口
6. 创建旧手机对象
7. 使用旧手机打电话
8. 使用旧手机发信息
9. 创建新手机对象
10. 使用新手机打电话
11. 使用新手机发信息
12. 使用新手机玩游戏
* */
public class Test3 {
    public static void main(String[] args) {
        OldPhone op=new OldPhone();
        op.call();
        op.sendMessage();
        NewPhone np=new NewPhone();
        np.call();
        np.sendMessage();
        np.playGame();
    }
}

interface Play{
    abstract void playGame();
}

class OldPhone{
    public void call(){
        System.out.println("oldPhone call");
    }

    public void sendMessage(){
        System.out.println("oldPhone sentMessage");
    }
}

class NewPhone extends OldPhone implements Play{

    @Override
    public void playGame() {
        System.out.println("NewPhone playGame");
    }

    @Override
    public void call() {
        System.out.println("NewPhone call");
    }

    @Override
    public void sendMessage() {
        System.out.println("NewPhone sendMessage");
    }
}