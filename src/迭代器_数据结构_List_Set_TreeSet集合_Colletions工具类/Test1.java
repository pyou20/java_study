package 迭代器_数据结构_List_Set_TreeSet集合_Colletions工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


