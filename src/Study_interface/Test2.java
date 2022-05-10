package Study_interface;

public class Test2 {
    public static void main(String[] args) {
        BB b=new BB();
        b.showA();
        b.showB10();
        b.showC10();
    }
}

interface AA{
    void showA();
    private void show10(String str){
        int i=0;
        while (i<10){
            System.out.print(str+" ");
            i++;
        }
        System.out.println(" ");
    }

    default void showB10(){
        show10("BBBB");
    }

    default void showC10(){
        show10("CCCC");
    }
}

class BB implements AA{

    @Override
    public void showA() {
        System.out.println("AAAA");
    }
}