package 常用API_正则表达式_泛型_Collection集合API;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 获取当前的日期,并把这个日期转换为指定格式的字符串。如：2088-08-08 08:08:08
* */

public class Test1{
    public static void main(String[] args) {
        Date now=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(df.format(now));
    }
}