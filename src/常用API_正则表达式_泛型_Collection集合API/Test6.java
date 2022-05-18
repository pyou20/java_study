package 常用API_正则表达式_泛型_Collection集合API;

import java.util.Date;

public class Test6 {
    public static void main(String[] args) {
        String value="T";
        long ago,now;
        ago=new Date().getTime();
        for (int i=0;i<10000;i++){
            value+=i;
        }
//        System.out.println(value);
        now=new Date().getTime();
        System.out.println((now-ago)+"ms");

        StringBuffer test=new StringBuffer("T");
        ago=new Date().getTime();
        for (int i=0;i<10000;i++){
            test.append(i);
        }
//        System.out.println(test);
        now=new Date().getTime();
        System.out.println((now-ago)+"ms");
    }
}
