package 常用API_正则表达式_泛型_Collection集合API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws ParseException {
        String birthDay="2001-4-29";
        long now,aliveTime;

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        Date t0=sdf.parse(birthDay);

        now=date.getTime();
        aliveTime=now -t0.getTime();

        System.out.println("你已经活了"+aliveTime/1000/60/60/24+"天");


    }
}
