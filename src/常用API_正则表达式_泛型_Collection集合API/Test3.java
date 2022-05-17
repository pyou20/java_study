package 常用API_正则表达式_泛型_Collection集合API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Calendar rightNow=Calendar.getInstance();

        long nowTime=rightNow.getTimeInMillis();


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(nowTime)+"\n五百天后:");
        rightNow.add(Calendar.DAY_OF_MONTH,500);
        long time=rightNow.getTimeInMillis();
        System.out.println(sdf.format(time));
        //System.out.println(rightNow.DAY_OF_YEAR+"年"+rightNow.DAY_OF_MONTH+"月"+rightNow.DAY_OF_MONTH);
    }
}
