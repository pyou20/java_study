package Study_interface;

/*
*   语法点：单例模式
*   使用两种单例模式编写AudioPlayer类
* */
public class Test5 {
    public static void main(String[] args) {

        AudioPlayer A=AudioPlayer.getInstance();
        AudioPlayer B=AudioPlayer.getInstance();
        System.out.println("A的地址："+A);
        System.out.println("B的地址："+B);

        VideoPlayer C=VideoPlayer.getInstance();
        VideoPlayer D=VideoPlayer.getInstance();
        System.out.println("C的地址："+C);
        System.out.println("D的地址："+D);

    }
}


class AudioPlayer{
    //1、私有化构造器
    private AudioPlayer(){
        System.out.println("AudioPlayer私有构造器调用,AudioPlayer对象创建,");
    }
    //2、定义成员变量保存创建对象
    private static final AudioPlayer instance=new AudioPlayer();
    //3、提供公共的访问方式
    public static AudioPlayer getInstance(){
        return instance;
    }
}

class VideoPlayer {
    //1、构造器私有
    private VideoPlayer(){
        System.out.println("VideoPlayer私有构造器调用,VideoPlayer对象创建,");
    }

    //2、创建静态变量保存对象;
    private static VideoPlayer instance;

    //3、提供公共静态方法，返回对象;
    public static VideoPlayer getInstance(){
        if (instance==null){
            instance=new VideoPlayer();
        }
        return instance;
    }
}
