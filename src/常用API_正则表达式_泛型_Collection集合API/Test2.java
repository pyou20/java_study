package 常用API_正则表达式_泛型_Collection集合API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*把你的生日字符串(格式：1992-10-20)转换为对应的日期对象.*/

public class Test2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(df.format(df.parse("2001-4-29 12:00:00")));
    }
}
