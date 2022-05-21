package 迭代器_数据结构_List_Set_TreeSet集合_Colletions工具类;

import java.util.LinkedList;

public interface Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println("打印链表"+linkedList);

        linkedList.add(2,"test");
        System.out.println("指定位置添加元素（2）\n"+linkedList);

        linkedList.set(1,"test1");
        System.out.println("将1位置变为test1\n"+linkedList);

        System.out.println("获取指定位置的元素\n"+linkedList.get(2));

        System.out.println("获取链表大小\n"+linkedList.size());

        linkedList.remove(1);
        System.out.println("删除指定索引元素");

        linkedList.clear();
        System.out.println("清空链表\n"+linkedList);
    }
}
